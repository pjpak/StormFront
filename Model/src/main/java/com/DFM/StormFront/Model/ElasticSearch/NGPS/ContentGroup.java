package com.DFM.StormFront.Model.ElasticSearch.NGPS;

/**
 * Created by Mick on 6/9/2016.
 */
public class ContentGroup
{
    private String id;

    private String name;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ContentGroup [id = "+id+", name = "+name+"]";
    }
}