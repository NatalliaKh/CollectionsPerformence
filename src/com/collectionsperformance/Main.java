package com.collectionsperformance;

import java.util.*;

public class Main {

    private static final int elementsAmount = 1000000;

    public static void main(String[] args) {
        checkListsPerformance();
        checkSetsPerformance();
        checkMapsPerformance();
    }

    private static void checkListsPerformance() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        long arrayListAdditionInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            arrayList.add(random.nextInt(100));
        }
        System.out.printf("Количество миллисекунд затраченных на добавление элементов в ArrayList-а равно: %d\n",
                System.currentTimeMillis() - arrayListAdditionInitialTime);
        LinkedList<Integer> linkedList = new LinkedList<>();
        long linkedListAdditionInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            linkedList.add(random.nextInt(100));
        }
        System.out.printf("Количество миллисекунд затраченных на добавление элементов в LinkedList-а равно: %d\n",
                System.currentTimeMillis() - linkedListAdditionInitialTime);
        long arrayListSearchInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            arrayList.contains(random.nextInt(100));
        }
        System.out.printf("Количество миллисекунд затраченных на поиск элемента в ArrayList-е равно: %d\n",
                System.currentTimeMillis() - arrayListSearchInitialTime);
        long linkedListSearchInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            linkedList.contains(random.nextInt(100));
        }
        linkedList.indexOf(50);
        System.out.printf("Количество миллисекунд затраченных на поиск элемента в LinkedList-е равно: %d\n",
                System.currentTimeMillis() - linkedListSearchInitialTime);
        long arrayListRemovalInitialTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(random.nextInt(arrayList.size()));
        }
        System.out.printf("Количество миллисекунд затраченных на удаление 1000 элементов из ArrayList-а равно: %d\n",
                System.currentTimeMillis() - arrayListRemovalInitialTime);
        long linkedListRemovalInitialTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(random.nextInt(linkedList.size()));
        }
        System.out.printf("Количество миллисекунд затраченных на удаление 1000 элементов из LinkedList-а равно: %d\n",
                System.currentTimeMillis() - linkedListRemovalInitialTime);
    }

    private static void checkSetsPerformance() {
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        long hashSetAdditionInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            hashSet.add(random.nextInt(10000));
        }
        System.out.printf("Количество миллисекунд затраченных на добавление элементов в HashSet равно: %d\n",
                System.currentTimeMillis() - hashSetAdditionInitialTime);
        TreeSet<Integer> treeSet = new TreeSet<>();
        long treeSetAdditionInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            treeSet.add(random.nextInt(elementsAmount));
        }
        System.out.printf("Количество миллисекунд затраченных на добавление элементов в TreeSet равно: %d\n",
                System.currentTimeMillis() - treeSetAdditionInitialTime);
        long hashSetSearchInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            hashSet.contains(random.nextInt(elementsAmount));
        }
        System.out.printf("Количество миллисекунд затраченных на поиск элементов в HashSet равно: %d\n",
                System.currentTimeMillis() - hashSetSearchInitialTime);
        long treeSetSearchInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            treeSet.contains(random.nextInt(elementsAmount));
        }
        System.out.printf("Количество миллисекунд затраченных на поиск элементов в TreeSet равно: %d\n",
                System.currentTimeMillis() - treeSetSearchInitialTime);
        long hashSetRemovalInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            hashSet.remove(random.nextInt(elementsAmount));
        }
        System.out.printf("Количество миллисекунд затраченных на удаление 1000000 элементов из HashSet равно: %d\n",
                System.currentTimeMillis() - hashSetRemovalInitialTime);
        long treeSetRemovalInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            treeSet.remove(random.nextInt(elementsAmount));
        }
        System.out.printf("Количество миллисекунд затраченных на удаление 1000000 элементов из TreeSet равно: %d\n",
                System.currentTimeMillis() - treeSetRemovalInitialTime);
    }

    private static void checkMapsPerformance() {
        Random random = new Random();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        long hashMapAdditionInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            hashMap.put(random.nextInt(elementsAmount), random.nextInt(elementsAmount));
        }
        System.out.printf("Количество миллисекунд затраченных на добавление элементов в HashMap равно: %d\n",
                System.currentTimeMillis() - hashMapAdditionInitialTime);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        long treeMapAdditionInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            treeMap.put(random.nextInt(elementsAmount), random.nextInt(elementsAmount));
        }
        System.out.printf("Количество миллисекунд затраченных на добавление элементов в TreeMap равно: %d\n",
                System.currentTimeMillis() - treeMapAdditionInitialTime);
        long hashMapSearchInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            hashMap.containsKey(random.nextInt(elementsAmount));
        }
        System.out.printf("Количество миллисекунд затраченных на поиск 1000000 элементов в HashMap равно: %d\n",
                System.currentTimeMillis() - hashMapSearchInitialTime);
        long treeMapSearchInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            treeMap.containsKey(random.nextInt(elementsAmount));
        }
        System.out.printf("Количество миллисекунд затраченных на поиск 1000000 элементов в TreeMap равно: %d\n",
                System.currentTimeMillis() - treeMapSearchInitialTime);
        long hashMapRemovalInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            hashMap.remove(random.nextInt(elementsAmount));
        }
        System.out.printf("Количество миллисекунд затраченных на удаление 1000000 элементов из HashMap равно: %d\n",
                System.currentTimeMillis() - hashMapRemovalInitialTime);
        long treeMapRemovalInitialTime = System.currentTimeMillis();
        for (int i = 0; i < elementsAmount; i++) {
            treeMap.remove(random.nextInt(elementsAmount));
        }
        System.out.printf("Количество миллисекунд затраченных на удаление 1000000 элементов из TreeMap равно: %d\n",
                System.currentTimeMillis() - treeMapRemovalInitialTime);
    }
}
