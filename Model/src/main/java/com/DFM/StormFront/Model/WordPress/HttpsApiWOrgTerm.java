package com.DFM.StormFront.Model.WordPress;

public class HttpsApiWOrgTerm
{
	private String taxonomy;
	public final String gettaxonomy()
	{
		return taxonomy;
	}
	public final void settaxonomy(String value)
	{
		taxonomy = value;
	}
	private boolean embeddable;
	public final boolean getembeddable()
	{
		return embeddable;
	}
	public final void setembeddable(boolean value)
	{
		embeddable = value;
	}
	private String href;
	public final String gethref()
	{
		return href;
	}
	public final void sethref(String value)
	{
		href = value;
	}
}