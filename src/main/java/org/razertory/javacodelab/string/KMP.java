package org.razertory.javacodelab.string;

public class KMP {

    /**
     * @param text      主串
     * @param target    子串
     * @return
     * @description Assert测试方法
     */
    public boolean kmpSearch(String text, String target) {
        int kmp = kmp(text, target);
        return kmp != -1;
    }

    /**
     * @param text      主串
     * @param target    子串
     * @return 子串在主串中所在的开始索引，返回 -1 则 主串中不存在子串
     * @description  kmp算法
     */
    public int kmp(String text, String target) {
        if (text == null || target == null || "".equals(text)
                || "".equals(target))
            return -1;
        char[] targetChars = target.toCharArray();
        char[] textChars = text.toCharArray();

        int textIndex = 0, targetIndex = 0;

        int[] next = getNext(target);

        while (targetIndex < targetChars.length && textIndex < textChars.length) {
            if (targetIndex == -1 || targetChars[targetIndex] == textChars[textIndex]) {
                ++targetIndex;
                ++textIndex;
            } else targetIndex = next[targetIndex];
        }

        if (targetIndex == targetChars.length) return textIndex - targetIndex;

        return -1;
    }

    /**
     * @param target    子串
     * @return  子串的next数组
     * @description 获得子串的next数组
     */
    private int[] getNext(String target) {
        char[] p = target.toCharArray();
        int[] next = new int[p.length];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < p.length - 1) {
            //k = -1 将k置0，将j+1
            if (k == -1 || p[j] == p[k]) {
                //下一个字符比较如果相等就跳过，避免子串重复回溯
                if (p[++j] == p[++k]) {
                    next[j] = next[k];
                } else {
                    next[j] = k;
                }
            } else {
                k = next[k];
            }
        }
        return next;
    }
}