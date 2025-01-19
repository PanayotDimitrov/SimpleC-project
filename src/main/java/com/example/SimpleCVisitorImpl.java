package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleCVisitorImpl extends SimpleCBaseVisitor<Integer> {
    private final Map<String, Integer> variables = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public Integer visitProgram(SimpleCParser.ProgramContext ctx) {
        for (SimpleCParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        return 0;
    }

    @Override
    public Integer visitStatement(SimpleCParser.StatementContext ctx) {
        visit(ctx.expression());
        return 0;
    }

    @Override
    public Integer visitAssignment(SimpleCParser.AssignmentContext ctx) {
        if (ctx.getChildCount() == 3) {
            // Handle A = expression
            String varName = ctx.Ident().getText();
            int value = visit(ctx.expression());
            variables.put(varName, value);
            System.out.println("Assigned " + value + " to " + varName);
            return value;
        } else if (ctx.getChildCount() == 2) {
            String varName = ctx.Ident().getText();
            if (!variables.containsKey(varName)) {
                throw new RuntimeException("Variable " + varName + " is not defined.");
            }
            if (ctx.getChild(1).getText().equals("++")) {
                // Handle A++
                int value = variables.get(varName) + 1;
                variables.put(varName, value);
                System.out.println(varName + " incremented to " + value);
                return value;
            } else if (ctx.getChild(1).getText().equals("--")) {
                // Handle A--
                int value = variables.get(varName) - 1;
                variables.put(varName, value);
                System.out.println(varName + " decremented to " + value);
                return value;
            }
        }
        throw new RuntimeException("Unknown assignment: " + ctx.getText());
    }

    @Override
    public Integer visitPrintfFunc(SimpleCParser.PrintfFuncContext ctx) {
        int value = visit(ctx.expression());
        System.out.println("Output: " + value);
        return 0;
    }

    @Override
    public Integer visitScanfFunc(SimpleCParser.ScanfFuncContext ctx) {
        System.out.print("Enter value: ");
        int value = 0;
        try {
            value = scanner.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    @Override
    public Integer visitAdditiveExpression(SimpleCParser.AdditiveExpressionContext ctx) {
        int result = visit(ctx.multiplicativeExpression(0));
        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            int value = visit(ctx.multiplicativeExpression(i));
            if (ctx.getChild(i * 2 - 1).getText().equals("+")) {
                result += value;
            } else {
                result -= value;
            }
        }
        return result;
    }

    @Override
    public Integer visitMultiplicativeExpression(SimpleCParser.MultiplicativeExpressionContext ctx) {
        int result = visit(ctx.primaryExpression(0));
        for (int i = 1; i < ctx.primaryExpression().size(); i++) {
            int value = visit(ctx.primaryExpression(i));
            String op = ctx.getChild(i * 2 - 1).getText();
            if (op.equals("*")) {
                result *= value;
            } else if (op.equals("/")) {
                result /= value;
            } else if (op.equals("%")) {
                result %= value;
            }
        }
        return result;
    }

    @Override
    public Integer visitPrimaryExpression(SimpleCParser.PrimaryExpressionContext ctx) {
        if (ctx.Number() != null) {
            return Integer.parseInt(ctx.Number().getText());
        } else if (ctx.Ident() != null) {
            String varName = ctx.Ident().getText();
            if (!variables.containsKey(varName)) {
                throw new RuntimeException("Variable " + varName + " is not defined.");
            }
            return variables.get(varName);
        } else if (ctx.expression() != null) {
            return visit(ctx.expression());
        }
        throw new RuntimeException("Unknown primary expression: " + ctx.getText());
    }
}
