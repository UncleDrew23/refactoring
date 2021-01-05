package refactoring.factory_method.example.factory;

import refactoring.factory_method.example.buttons.Button;

/**
 * @program: refactoring
 * @description: 基础创建者
 * @author: ycbron
 * @create: 2021-01-06 01:26
 **/
public abstract class Dialog {
    /**
     * Base factory class. Note that "factory" is merely a role for the class. It
     * should have some core business logic which needs different products to be
     * created.
     */
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}
