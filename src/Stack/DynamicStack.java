package Stack;

public class DynamicStack<E> extends CustomStack<E>{

    DynamicStack(){
        super();
    }

    DynamicStack(int size)
    {
        super(size);
    }

    @Override
    public boolean push(E element) throws Exception {
        if(this.isFull())
        {
            Object[] temp = new Object[data.length * 2]; //Create a temporary array of double the size

            //Copy all the elements of data to temp
            for(int i = 0; i < data.length; i++)
            {
                temp[i] = data[i];
            }
            data = temp;
        }

        return super.push(element);
    }
}
