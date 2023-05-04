package adapters;

import integer.values.IntegerValue;
import integer.values.IntegerValueInterface;

public class ObjectAdapter implements IntegerValueInterface {
    private IntegerValue myInt;

    public ObjectAdapter(IntegerValue myInt) {
        this.myInt = myInt;
    }

    public int getInteger() {
        return 2 + this.myInt.getInteger();
    }
}
