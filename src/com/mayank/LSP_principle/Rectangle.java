package com.mayank.LSP_principle;

public class Rectangle {

         int width, height;

        Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        int getArea() {
            return width * height;
        }

        @Override
        public String toString() {
            return "Figure(" +
                    "width=" + width +
                    ", height=" + height +
                    ')';
        }
}
