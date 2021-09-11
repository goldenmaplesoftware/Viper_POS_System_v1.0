package POS.StockLists;

public class VideoGamesTitles<ElementPosition,GameTitle>
{
    private ElementPosition  indexPosition;
    private GameTitle title;

public VideoGamesTitles(ElementPosition element, GameTitle title)
{
    this.indexPosition=element;
    this.title=title;
}

    public void setKey(ElementPosition element)
    {
        this.indexPosition = indexPosition;
    }

    public void setValue(GameTitle title)
    {
        this.title = title;
    }

    public ElementPosition getKey()
    {
        return this.indexPosition = indexPosition;
    }

    public GameTitle getValue()
    {
        return this.title = title;
    }








}
