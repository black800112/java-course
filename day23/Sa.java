class Sa extends School1 implements School2
//一個class可繼承兩個父類別,一個標記extends,一個標記implements(標記implements的class,在class名稱前面也要加上implements)
//圖形界面extends為實線,implements為虛線
//implements接的是介面,需要注意抽象文法
{
    Sa()
    {
        super("aa");
    }
}