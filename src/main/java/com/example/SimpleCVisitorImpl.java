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
        String varName = ctx.Ident().getText(); // Variable name
        int value = visit(ctx.expression());   // Evaluate the right-hand side
        variables.put(varName, value);         // Store in the variable map
        System.out.println("Assigned " + value + " to " + varName);
        return value;
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
        int value = scanner.nextInt();
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
            } else {
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
