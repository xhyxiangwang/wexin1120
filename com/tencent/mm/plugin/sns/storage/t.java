package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.b.k;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

public final class t
  extends i<s>
  implements k
{
  public static final String[] gMz;
  public e gMB;
  
  static
  {
    GMTrace.i(8184999706624L, 60983);
    gMz = new String[] { i.a(s.gLR, "snsTagInfo2") };
    GMTrace.o(8184999706624L, 60983);
  }
  
  public t(e parame)
  {
    super(parame, s.gLR, "snsTagInfo2", null);
    GMTrace.i(8183254876160L, 60970);
    this.gMB = parame;
    GMTrace.o(8183254876160L, 60970);
  }
  
  public static String bkH()
  {
    GMTrace.i(8183389093888L, 60971);
    GMTrace.o(8183389093888L, 60971);
    return "select tagId, tagName, count, rowid from snsTagInfo2";
  }
  
  public final boolean S(String paramString, long paramLong)
  {
    GMTrace.i(8184597053440L, 60980);
    s locals = dR(5L);
    if (bg.mZ(locals.field_memberList))
    {
      GMTrace.o(8184597053440L, 60980);
      return false;
    }
    boolean bool = bg.f(locals.field_memberList.split(",")).contains(paramString);
    GMTrace.o(8184597053440L, 60980);
    return bool;
  }
  
  public final boolean a(s params)
  {
    GMTrace.i(8184060182528L, 60976);
    if (params.field_tagId == 0L)
    {
      GMTrace.o(8184060182528L, 60976);
      return false;
    }
    long l = params.field_tagId;
    Object localObject = "select *, rowid from snsTagInfo2 where tagId = ? ";
    localObject = this.gMB.a((String)localObject, new String[] { String.valueOf(l) }, 2);
    boolean bool = ((Cursor)localObject).moveToFirst();
    ((Cursor)localObject).close();
    if (!bool) {
      super.b(params);
    }
    for (;;)
    {
      GMTrace.o(8184060182528L, 60976);
      return true;
      super.a(params);
    }
  }
  
  public final boolean bgc()
  {
    GMTrace.i(8184731271168L, 60981);
    if (bkI().size() == 0)
    {
      GMTrace.o(8184731271168L, 60981);
      return false;
    }
    GMTrace.o(8184731271168L, 60981);
    return true;
  }
  
  public final List<Long> bkI()
  {
    GMTrace.i(8183925964800L, 60975);
    Cursor localCursor = this.gMB.a("snsTagInfo2", new String[] { "tagId" }, null, null, null, null, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext()) {
      localArrayList.add(Long.valueOf(localCursor.getLong(0)));
    }
    localCursor.close();
    GMTrace.o(8183925964800L, 60975);
    return localArrayList;
  }
  
  public final s dR(long paramLong)
  {
    GMTrace.i(8183523311616L, 60972);
    Object localObject = "select *, rowid from snsTagInfo2 where tagId = ? ";
    localObject = this.gMB.a((String)localObject, new String[] { String.valueOf(paramLong) }, 2);
    s locals = new s();
    if (((Cursor)localObject).moveToFirst()) {
      locals.b((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    GMTrace.o(8183523311616L, 60972);
    return locals;
  }
  
  public final int dS(long paramLong)
  {
    GMTrace.i(8184194400256L, 60977);
    int i = this.gMB.delete("snsTagInfo2", " tagId = ? ", new String[] { String.valueOf(paramLong) });
    GMTrace.o(8184194400256L, 60977);
    return i;
  }
  
  public final List<String> dm(long paramLong)
  {
    GMTrace.i(8183657529344L, 60973);
    Object localObject = dR(paramLong);
    if ((((s)localObject).field_memberList != null) && (!((s)localObject).field_memberList.equals("")))
    {
      localObject = bg.f(((s)localObject).field_memberList.split(","));
      GMTrace.o(8183657529344L, 60973);
      return (List<String>)localObject;
    }
    localObject = new ArrayList();
    GMTrace.o(8183657529344L, 60973);
    return (List<String>)localObject;
  }
  
  public final String dn(long paramLong)
  {
    GMTrace.i(8183791747072L, 60974);
    String str = dR(paramLong).field_tagName;
    GMTrace.o(8183791747072L, 60974);
    return str;
  }
  
  public final Cursor getCursor()
  {
    GMTrace.i(8184462835712L, 60979);
    Cursor localCursor = this.gMB.rawQuery("select *, rowid from snsTagInfo2 where tagId > 5", null);
    GMTrace.o(8184462835712L, 60979);
    return localCursor;
  }
  
  public final boolean p(long paramLong, String paramString)
  {
    GMTrace.i(8184328617984L, 60978);
    paramString = "select tagId, tagName, count, rowid from snsTagInfo2 where tagId > 5" + " AND  tagName  =\"" + bg.mX(paramString) + "\" AND  tagId != " + paramLong;
    w.d("MicroMsg.SnsTagInfoStorage", "isTagNameExist " + paramString);
    paramString = this.gMB.a(paramString, null, 2);
    boolean bool = paramString.moveToFirst();
    paramString.close();
    GMTrace.o(8184328617984L, 60978);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */