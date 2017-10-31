package com.tencent.mm.plugin.favorite.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

public final class h
  extends i<g>
{
  public static final String[] gMz;
  public e gMB;
  
  static
  {
    GMTrace.i(6265820413952L, 46684);
    gMz = new String[] { i.a(g.gLR, "FavEditInfo") };
    GMTrace.o(6265820413952L, 46684);
  }
  
  public h(e parame)
  {
    super(parame, g.gLR, "FavEditInfo", null);
    GMTrace.i(6265686196224L, 46683);
    this.gMB = parame;
    this.gMB.eL("FavEditInfo", "CREATE INDEX IF NOT EXISTS IndexLocalId_Type ON FavEditInfo(localId,type);");
    GMTrace.o(6265686196224L, 46683);
  }
  
  public final List<g> awH()
  {
    GMTrace.i(16937471967232L, 126194);
    Cursor localCursor = this.gMB.a("select count(*) from FavEditInfo", null, 2);
    if (localCursor == null)
    {
      w.e("MicroMsg.FavModInfoStorage", "count all edit info, cursor is null");
      GMTrace.o(16937471967232L, 126194);
      return null;
    }
    try
    {
      if (localCursor.moveToFirst()) {
        w.i("MicroMsg.FavModInfoStorage", "get all edit infos, count %d", new Object[] { Integer.valueOf(localCursor.getInt(0)) });
      }
      localCursor.close();
      localCursor = this.gMB.a("select * from FavEditInfo", null, 2);
      if (localCursor == null)
      {
        GMTrace.o(16937471967232L, 126194);
        return null;
      }
    }
    catch (Exception localException1)
    {
      w.printErrStackTrace("MicroMsg.FavModInfoStorage", localException1, "", new Object[0]);
      localCursor.close();
      GMTrace.o(16937471967232L, 126194);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    try
    {
      if (localCursor.moveToFirst())
      {
        boolean bool;
        do
        {
          g localg = new g();
          localg.b(localCursor);
          localArrayList.add(localg);
          bool = localCursor.moveToNext();
        } while (bool);
      }
      localCursor.close();
      GMTrace.o(16937471967232L, 126194);
      return localArrayList;
    }
    catch (Exception localException2)
    {
      w.printErrStackTrace("MicroMsg.FavModInfoStorage", localException2, "", new Object[0]);
      localCursor.close();
      GMTrace.o(16937471967232L, 126194);
    }
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */