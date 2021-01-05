package refactoring.factory_method.example.buttons;

/**
 * @program: refactoring
 * @description: 具体产品
 * @author: ycbron
 * @create: 2021-01-06 00:50
 **/
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
