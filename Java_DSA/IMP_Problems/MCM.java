public class MCM {
        public static int matrixChainOrder(int[] dims) {
            int n = dims.length - 1;
            int[][] m = new int[n][n];
            for (int i = 0; i < n; i++) m[i][i] = 0;
            for (int L = 2; L <= n; L++) {
                for (int i = 0; i < n - L + 1; i++) {
                    int j = i + L - 1;
                    m[i][j] = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        int q = m[i][k] + m[k + 1][j] + dims[i] * dims[k + 1] * dims[j + 1];
                        if (q < m[i][j]) m[i][j] = q;
                    }
                }
            }
            return m[0][n - 1];
        }
        public static void main(String[] args) {
            int[] dims = {40, 20, 30, 10, 30};
            System.out.println("Minimum number of multiplications is " + matrixChainOrder(dims));
            System.out.println("By Lokireddy Chakridhar Reddy (2022601278)");
        }
}
