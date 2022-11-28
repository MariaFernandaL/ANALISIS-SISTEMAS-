package visitor.visitor;

import visitor.figure.Circle;
import visitor.figure.CompoundShape;
import visitor.figure.Rectangle;
import visitor.shape.Dot;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
