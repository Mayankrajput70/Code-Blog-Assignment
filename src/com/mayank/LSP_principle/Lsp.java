package com.mayank.LSP_principle;

import org.jetbrains.annotations.NotNull;

public class Lsp {
    public static void main(String[] args) {
        Rectangle rectangle = RectangleFactory.newRectangle(2, 4);
        Rectangle square = RectangleFactory.newSquare(4);

        showArea(rectangle);
        showArea(square);
    }

    private static void showArea(@NotNull Rectangle figure) {
        System.out.println("Expected area is " + figure.getArea() + " for " + figure);
    }
}