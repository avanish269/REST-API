package hello;


public class greeting
{
  private long id;
  private String content;
  public greeting(long i, String c)
  {
    this.id=i;
    this.content=c;
  }
  public long getid()
  {
    return this.id;
  }
  public String getContent()
  {
    return this.content;
  }
}
