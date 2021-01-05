package refactoring.factory_method.example;

import refactoring.factory_method.example.factory.Dialog;
import refactoring.factory_method.example.factory.HtmlDialog;
import refactoring.factory_method.example.factory.WindowsDialog;

/**
 * @program: refactoring
 * @description: 客户端代码
 * @author: ycbron
 * @create: 2021-01-06 01:34
 **/
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (!System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
