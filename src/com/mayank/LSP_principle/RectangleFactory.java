package com.mayank.LSP_principle;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class RectangleFactory {
        @Contract("_ -> new")
        public static @NotNull Rectangle newSquare(int side) {
            return new Rectangle(side, side);
        }

        @Contract("_, _ -> new")
        public static @NotNull Rectangle newRectangle(int width, int height) {
            return new Rectangle(width, height);
        }
}
