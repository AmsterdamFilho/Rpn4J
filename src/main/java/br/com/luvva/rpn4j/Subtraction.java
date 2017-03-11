package br.com.luvva.rpn4j;

/**
 * @author Lima Filho, A. L. - amsterdam@luvva.com.br
 */
class Subtraction implements NumberOperation
{
    @Override
    public double resolve (double leftOperand, double rightOperand)
    {
        return leftOperand - rightOperand;
    }
}
