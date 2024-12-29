class Main {
  public static void main(String[] args) throws Exception {
    String str = "abbcdebba";
    HuffmanCoder hf = new HuffmanCoder(str);
    String cs = hf.encode(str);
    System.out.println(cs);
    String dc = hf.decode(cs);
    System.out.println(dc);

  }
}