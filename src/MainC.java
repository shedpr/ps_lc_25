import ArrayHashing.CreateParenthesis;
import ArrayHashing.LongestConsequriveSequence;
import ArrayHashing.ValidSudoku;
import BiarySearch.CocoBanana;
import BiarySearch.FindMinInRotatedSortedArray;
import Graph.RottingFruit;
import Greedy.GasStation;
import Greedy.JumpGame;
import Heap.KClosestPointToOrigin;
import Heap.KLargestElement;
import Heap.TaskScheduler;
import SlidingWindow.LongestSubstringWithoutRepeatingCharacters;
import SlidingWindow.MergeSortedArray;
import SlidingWindow.PermutationInString;
import Stack.BasicCalculatorII;
import Stack.EvaluateRPN;
import Stack.NextGreatestEle;

public class MainC {
    public static void main(String[] args) {
//        PermutationString permutationString = new PermutationString();
//        permutationString.backtrack("ABC", 0, 2);2

//        KadaneAlgo ka = new KadaneAlgo();
//        ka.runAlgo(new  int[]{2,3,-8,7,-1,2,3});

//        SumOfKSubArrays sumOfKSubArrays = new SumOfKSubArrays();
//        sumOfKSubArrays.sumOfKSubArrays(new int[]{2,4,9,-10,5,1,2,0,19,-6}, 3);

//        LongestSubstringWithoutRepeatChar lswrc = new LongestSubstringWithoutRepeatChar();
//        lswrc.longestSubstringWithoutRepeat("pwwkew");

//        DailyTemperature dt = new DailyTemperature();
//        dt.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});

//        GroupAnagrams ga = new GroupAnagrams();
//        List<List<String>> res  = ga.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
//        for (List<String> str : res) {
//            for(String s : str) {
//                System.out.print(s + "\t");
//            }
//        }
//
//        PermutationInString pis = new PermutationInString();
//        pis.checkInclusion("abc", "decab");

//        MaxSumDistinctSubarraysWithLengthK mSDSWL = new MaxSumDistinctSubarraysWithLengthK();
//        mSDSWL.maximumSubarraySum(new int[]{1,5,4,2,9,9,9}, 3);

//        ListNode start = new ListNode(1);
//        start.next = new ListNode(2);
//        start.next.next = new ListNode(3);
//        start.next.next.next = new ListNode(4);
//        start.next.next.next.next = new ListNode(5);
//
//        ReorderList reorderList = new ReorderList();
//        reorderList.reorderList(start);
        //       System.out.println("priyanka");
//        CreateATreeFromList cre = new CreateATreeFromList();
//        TreeNode res = cre.createTreeFromList(new String[]{"3","9","20","","","15","7"});
//        LevelOrder lo = new LevelOrder();
//        lo.levelOrder(res);
        //     cre.displayList(res);

//        MaxAreaOfIsland max = new MaxAreaOfIsland();
//        int arr[][] = {
//                {0,0,1,0,0,0,0,1,0,0,0,0,0},
//                {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                {0,1,1,0,1,0,0,0,0,0,0,0,0},
//                {0,1,0,0,1,1,0,0,1,0,1,0,0},
//                {0,1,0,0,1,1,0,0,1,1,1,0,0},
//                {0,0,0,0,0,0,0,0,0,0,1,0,0},
//                {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                {0,0,0,0,0,0,0,1,1,0,0,0,0}
//        };
//        max.maxAreaOfIsland(arr);

//        StringPermutation perm = new StringPermutation();
//        perm.permute(new int[]{1,2,3});

//        NumOfIslands numOfIslands = new NumOfIslands();
//        System.out.println(numOfIslands.numIslands(new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}}));

//        WallsAndGates wg = new WallsAndGates();
//        wg.wallsAndGates(new int[][]
//                {
//                        {2147483647,-1,0,2147483647},
//                        {2147483647,2147483647,2147483647,-1},
//                        {2147483647,-1,2147483647,-1},
//                        {0,-1,2147483647,2147483647}});

//        RottingFruit fruit = new RottingFruit();
//        System.out.println(fruit.orangesRotting(new int[][]{{1,1,0},{0,1,1},{0,1,2}}));

//        ValidSudoku validSudoku = new ValidSudoku();
//        validSudoku.isValidSudoku(new char[][]{
//                {'8','3','.','.','7','.','.','.','.'},
//                {'6','.','.','1','9','5','.','.','.'},
//                {'.','9','8','.','.','.','.','6','.'},
//                {'8','.','.','.','6','.','.','.','3'},
//                {'4','.','.','8','.','3','.','.','1'},
//                {'7','.','.','.','2','.','.','.','6'},
//                {'.','6','.','.','.','.','2','8','.'},
//                {'.','.','.','4','1','9','.','.','5'},
//                {'.','.','.','.','8','.','.','7','9'}});
//    }

//        JumpGame jumpGame = new JumpGame();
//        jumpGame.canJump(new int[]{2,3,1,1,4});

//        GasStation gs = new GasStation();
//        gs.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2});

//        CocoBanana cb = new CocoBanana();
//        cb.minEatingSpeed(new int[]{30,11,23,4,20}, 5);

//        FindMinInRotatedSortedArray fm = new FindMinInRotatedSortedArray();
//        fm.findMin(new int[]{4,5,6,7,0,1,2});

//        TaskScheduler ts = new TaskScheduler();
//        ts.leastInterval(new char[]{'A','A','A','B','B','B'}, 2);

//        KLargestElement k = new KLargestElement();
//        k.findKthLargest(new int[]{-1,2,0}, 2);

//        KClosestPointToOrigin kpc = new KClosestPointToOrigin();
//        kpc.kClosest(new int[][]{{0,2},{2,0},{2,2}}, 2);
//        EvaluateRPN evaluateRPN = new EvaluateRPN();
//        evaluateRPN.evalRPN(new String[]{"2","1","+","3","*"});

//        PermutationInString permutationInString = new PermutationInString();
//        permutationInString.checkInclusion("hello", "ooolleoooleh");

//        LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();
//        lswrc.lengthOfLongestSubstring("zeabagehi");

//        LongestConsequriveSequence lcs = new LongestConsequriveSequence();
//        lcs.longestConsecutive(new int[]{100,4,200,1,3,2});

//        CreateParenthesis createParenthesis = new CreateParenthesis();
//        createParenthesis.generateParenthesis(3);

//        NextGreatestEle nge = new NextGreatestEle();
//        nge.nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});

//        BasicCalculatorII bc = new BasicCalculatorII();
//        bc.calculate("3+2*4");

        MergeSortedArray msa = new MergeSortedArray();
        msa.merge(new int[]{1,2,3,0,0,0},  3, new int[]{2,5,6}, 3);
    }
}
