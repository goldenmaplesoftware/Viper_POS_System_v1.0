package POS.StockLists;

public class VideoGamesDescriptions<ElementPosition,GameTitle>
{
    private ElementPosition  indexPosition;
    private GameTitle description;

public VideoGamesDescriptions(ElementPosition element, GameTitle description)
{
    this.indexPosition=element;
    this.description=description;
}

    public void setKey(ElementPosition element)
    {
        this.indexPosition = indexPosition;
    }

    public void setValue(GameTitle description)
    {
        this.description = description;
    }

    public ElementPosition getKey()
    {
        return this.indexPosition = indexPosition;
    }

    public GameTitle getValue()
    {
        return this.description = description;
    }








}
