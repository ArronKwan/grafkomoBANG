import Engine.Window;
import org.lwjgl.glfw.GLFW.*;
import org.lwjgl.opengl.GL;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;



public class Main {
    private Window window =
            new Window(800,800,"Hello World");
    public void run() {
        init();
        loop();

        glfwTerminate();
        glfwSetErrorCallback(null).free();

    }

    public void init() {
        window.init();
        GL.createCapabilities();

        //code taro setelah init dan GL
    }

    public void loop() {
//        kalo ga pake loop nnti habis buka window baru langsung ketutup (ga bisa tambahin frame)
        while(window.isOpen()){
            window.update();
//            warna hanya 0 - 1 pake f
            glClearColor(0,0,0,0);
            GL.createCapabilities();

            //code
            //..

            glDisableVertexAttribArray(0);
            glfwPollEvents();
        }
    }

    public static void main(String[] args) {
        new Main().run();

    }
}