package refactoring.factory_method.example.factory;

import refactoring.factory_method.example.buttons.Button;
import refactoring.factory_method.example.buttons.WindowsButton;

/**
 * @program: refactoring
 * @description: 另一个创建者
 * Windows Dialog will produce Windows buttons.
 * @author: ycbron
 * @create: 2021-01-06 01:30
 **/
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
