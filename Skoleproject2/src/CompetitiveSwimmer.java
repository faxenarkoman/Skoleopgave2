public class CompetitiveSwimmer
{
    double bestSwimmingResults;
    int date;



    public void results()
    {
        System.out.println(name + bestSwimmingResults + date);
    }

    public void top5()
    {
        System.out.println("The swimmers with the best times are as following");
        System.out.println(name + bestSwimmingResults);
    }
}

