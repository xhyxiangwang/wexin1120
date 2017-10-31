package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import com.tencent.mm.bt.g;
import com.tencent.mm.protocal.c.ajl;
import com.tencent.mm.protocal.c.bdi;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class p
  extends i<o>
{
  public static final String[] gMz;
  public g hhi;
  
  static
  {
    GMTrace.i(8310895935488L, 61921);
    gMz = new String[] { i.a(o.gLR, "SnsReportKv") };
    GMTrace.o(8310895935488L, 61921);
  }
  
  public p(g paramg)
  {
    super(paramg, o.gLR, "SnsReportKv", o.fSf);
    GMTrace.i(8310359064576L, 61917);
    this.hhi = paramg;
    GMTrace.o(8310359064576L, 61917);
  }
  
  private int a(bdi parambdi, int paramInt)
  {
    GMTrace.i(8310627500032L, 61919);
    try
    {
      parambdi = parambdi.toByteArray();
      o localo = new o();
      localo.field_value = parambdi;
      localo.field_logtime = System.currentTimeMillis();
      localo.field_logsize = paramInt;
      localo.field_offset = 0;
      parambdi = localo.qQ();
      paramInt = (int)this.hhi.insert("SnsReportKv", "", parambdi);
      w.d("MicroMsg.SnsKvReportStg", "SnsKvReport Insert result " + paramInt);
      GMTrace.o(8310627500032L, 61919);
      return paramInt;
    }
    catch (Exception parambdi)
    {
      GMTrace.o(8310627500032L, 61919);
    }
    return 0;
  }
  
  public final int a(bdi parambdi)
  {
    GMTrace.i(8310493282304L, 61918);
    bdi localbdi = new bdi();
    int k = 0;
    int i = 0;
    int j = 0;
    if (k < parambdi.tuT.size())
    {
      ajl localajl = (ajl)parambdi.tuT.get(k);
      if (localajl.uey.toK.length + j > 51200)
      {
        a(localbdi, j);
        i += 1;
        localbdi.tuT.clear();
        j = 0;
      }
      for (;;)
      {
        k += 1;
        break;
        j += localajl.uey.toK.length;
        localbdi.tuT.add(localajl);
      }
    }
    k = i;
    if (localbdi.tuT.size() > 0)
    {
      k = i + 1;
      a(localbdi, j);
    }
    GMTrace.o(8310493282304L, 61918);
    return k;
  }
  
  public final bdi cZ(int paramInt1, int paramInt2)
  {
    GMTrace.i(8310761717760L, 61920);
    Object localObject = "select rowid, *  from SnsReportKv";
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramInt2 > 0) {
      localObject = "select rowid, *  from SnsReportKv" + " where rowid <= " + paramInt2;
    }
    Cursor localCursor = this.hhi.a((String)localObject, null, 0);
    bdi localbdi = new bdi();
    i = 0;
    ArrayList localArrayList = new ArrayList();
    localStringBuffer.append("target size " + paramInt1 + " current maxcolid " + paramInt2);
    if (localCursor.moveToFirst()) {
      paramInt2 = i;
    }
    for (;;)
    {
      o localo = new o();
      localo.b(localCursor);
      i = localo.field_offset;
      localStringBuffer.append("|offset: " + i);
      localObject = new bdi();
      for (;;)
      {
        try
        {
          ((bdi)localObject).aC(localo.field_value);
        }
        catch (Exception localException2)
        {
          ajl localajl;
          continue;
          i = 0;
          continue;
          i = 1;
          continue;
        }
        try
        {
          if (i >= ((bdi)localObject).tuT.size()) {
            continue;
          }
          localajl = (ajl)((bdi)localObject).tuT.get(i);
          if (localajl.uey.toK.length + paramInt2 > paramInt1)
          {
            if (paramInt2 != 0) {
              continue;
            }
            localArrayList.add(Integer.valueOf(localo.quQ));
            w.i("MicroMsg.SnsKvReportStg", "error by server for the mini size " + paramInt1 + " vlauesize " + localajl.uey.toK.length);
            continue;
            localStringBuffer.append("|read end on " + localo.quQ + " and get size " + paramInt2);
            if ((i != 0) && (localo.field_offset <= ((bdi)localObject).tuT.size()))
            {
              a(localo.quQ, localo);
              localStringBuffer.append("|update new offset " + localo.field_offset);
              if (i == 0) {
                continue;
              }
              w.i("MicroMsg.SnsKvReportStg", "read info " + localStringBuffer.toString());
              localCursor.close();
              localObject = localArrayList.iterator();
              if (!((Iterator)localObject).hasNext()) {
                continue;
              }
              delete(((Integer)((Iterator)localObject).next()).intValue());
              continue;
            }
          }
          else
          {
            localo.field_offset = (i + 1);
            localbdi.tuT.add(localajl);
            int j = paramInt2 + localajl.uey.toK.length;
            i += 1;
            paramInt2 = j;
            continue;
          }
          localStringBuffer.append("|read full ");
          localArrayList.add(Integer.valueOf(localo.quQ));
          continue;
          if (localCursor.moveToNext()) {
            break;
          }
        }
        catch (Exception localException1)
        {
          w.printErrStackTrace("MicroMsg.SnsKvReportStg", localException1, "", new Object[0]);
          localArrayList.add(Integer.valueOf(localo.quQ));
          w.i("MicroMsg.SnsKvReportStg", "error paser then delete " + localo.quQ);
        }
      }
    }
    for (;;)
    {
      break;
    }
    GMTrace.o(8310761717760L, 61920);
    return localbdi;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */