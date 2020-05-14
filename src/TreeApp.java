

public class TreeApp {



    public static void main(String[] args) {
        int k = 0;

        for (int i = 0; i < 56; i++) {
            Tree<Person> tree = new TreeImpl<>();

            for (int j = 0; j < 30; j++) {
                tree.add(new Person(-50 + (int) (Math.random() * 100), "Viktor"));
            }
            if(TreeImpl.isBalanced(((TreeImpl<Person>) tree).root)){
                k++;
            }
            tree.display();
        }
        System.out.println(k*100/20+"% деревьев сбалансированны");
    }
}
