package org.smart4j.framework.threadlocal;



/**
 * @author BusyCowboy01
 * @date 2018/7/30.
 * @description
 */
public class TestMyThreadLocal implements Sequence{
    private static MyThreadLocal<Integer> numberContainer = new MyThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public int getNumber() {
        numberContainer.set(numberContainer.get()+1);
        return numberContainer.get();
    }
    public static void main(String [] args){
        TestMyThreadLocal sequence = new TestMyThreadLocal();
        ClientThread thread1 = new ClientThread(sequence);
        ClientThread thread2 = new ClientThread(sequence);
        ClientThread thread3 = new ClientThread(sequence);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
