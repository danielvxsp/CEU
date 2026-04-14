public class MaximosValores {
    public static void main(String[] args) {
        	        
        
        byte maxByteHex = 0x7f;                
        short maxShortHex = 0x7fff;            
        int maxIntHex = 0x7fffffff;
        long maxLongHex = 0x7fffffffffffffffL;

        System.out.println("Byte max:  " + maxByteHex);
        System.out.println("Short max: " + maxShortHex);
        System.out.println("Int max:   " + maxIntHex);
        System.out.println("Long max:  " + maxLongHex);
        
        byte maxByteClass = Byte.MAX_VALUE;
        short maxShortClass = Short.MAX_VALUE;
        int maxIntClass = Integer.MAX_VALUE;
        long maxLongClass = Long.MAX_VALUE;
        
        System.out.println("Byte.MAX_VALUE:  " + maxByteClass);
        System.out.println("Short.MAX_VALUE: " + maxShortClass);
        System.out.println("Integer.MAX_VALUE: " + maxIntClass);
        System.out.println("Long.MAX_VALUE:  " + maxLongClass);
    }
}
