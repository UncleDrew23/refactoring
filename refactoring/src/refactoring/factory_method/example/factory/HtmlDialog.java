package refactoring.factory_method.example.factory;

import refactoring.factory_method.example.buttons.Button;
import refactoring.factory_method.example.buttons.HtmlButton;

/**
 * @program: refactoring
 * @description: 具体创建者
 *  HTML Dialog will produce HTML buttons.
 * @author: ycbron
 * @create: 2021-01-06 01:30
 **/
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
