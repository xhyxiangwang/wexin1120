package com.tencent.mm.plugin.sns.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.g.a;
import com.tencent.mm.protocal.c.afk;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.cc;
import com.tencent.mm.protocal.c.dl;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class h
  extends e<amn>
{
  private List<amn> fIU;
  private String nkl;
  private String path;
  private int qwJ;
  private int qwK;
  private dl qxa;
  private cc qxb;
  private a qxc;
  
  public h(a parama)
  {
    GMTrace.i(8396526845952L, 62559);
    this.fIU = new ArrayList();
    this.qwJ = 0;
    this.qwK = 0;
    this.nkl = "";
    this.path = "";
    this.qxc = parama;
    GMTrace.o(8396526845952L, 62559);
  }
  
  public final List<amn> bkK()
  {
    GMTrace.i(8396795281408L, 62561);
    ArrayList localArrayList = new ArrayList();
    try
    {
      localArrayList.clear();
      this.qxb = null;
      Object localObject1 = this.path + this.nkl + "_ARTISTF.mm";
      Object localObject2;
      if (FileOp.aZ((String)localObject1))
      {
        localObject2 = FileOp.c((String)localObject1, 0, -1);
        this.qxb = ((cc)new cc().aC((byte[])localObject2));
      }
      if (this.qxb == null)
      {
        localObject2 = this.path + this.nkl + "_ARTIST.mm";
        this.qxb = a.Hi(new String(FileOp.c((String)localObject2, 0, (int)FileOp.kI((String)localObject2))));
        if (this.qxb == null)
        {
          FileOp.deleteFile((String)localObject2);
          GMTrace.o(8396795281408L, 62561);
          return null;
        }
        FileOp.deleteFile((String)localObject1);
        FileOp.j((String)localObject1, this.qxb.toByteArray());
      }
      localObject1 = this.qxb;
      if (localObject1 == null)
      {
        GMTrace.o(8396795281408L, 62561);
        return null;
      }
      localObject1 = this.qxb.tvK.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject3 = (afk)((Iterator)localObject1).next();
        localObject2 = ((afk)localObject3).mCJ;
        localObject3 = ((afk)localObject3).tKd.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          amn localamn = (amn)((Iterator)localObject3).next();
          localamn.mCK = ((String)localObject2);
          localArrayList.add(localamn);
        }
      }
      this.qxa = this.qxb.tvJ;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.ArtistAdapterHelper", localException, "loadData failed.", new Object[0]);
      GMTrace.o(8396795281408L, 62561);
      return null;
    }
    GMTrace.o(8396795281408L, 62561);
    return localException;
  }
  
  public final void bx(List<amn> paramList)
  {
    GMTrace.i(8396661063680L, 62560);
    if (this.qxc != null)
    {
      if (paramList != null)
      {
        HashMap localHashMap1 = new HashMap();
        HashMap localHashMap2 = new HashMap();
        localHashMap1.clear();
        localHashMap2.clear();
        int n = paramList.size();
        w.d("MicroMsg.ArtistAdapterHelper", "initFixType " + n);
        int j = 0;
        int k = 0;
        int m = 0;
        if (j < n)
        {
          String str = ((amn)paramList.get(j)).mCK;
          int i;
          if (j + 1 < n)
          {
            if (str.equals(((amn)paramList.get(j + 1)).mCK)) {
              break label202;
            }
            i = 1;
          }
          for (;;)
          {
            localHashMap1.put(Integer.valueOf(k), Integer.valueOf(m));
            localHashMap2.put(Integer.valueOf(k), Integer.valueOf(i));
            m += i;
            k += 1;
            j = i + j;
            break;
            i = 1;
            continue;
            label202:
            if (j + 2 < n)
            {
              if (!str.equals(((amn)paramList.get(j + 2)).mCK)) {
                i = 2;
              }
            }
            else
            {
              i = 2;
              continue;
            }
            i = 3;
          }
        }
        this.qwJ = (k + 1);
        this.qwK = paramList.size();
        w.d("MicroMsg.ArtistAdapterHelper", "icount " + this.qwJ);
        this.fIU = paramList;
        this.qxc.a(this.fIU, localHashMap1, localHashMap2, this.qwK, this.qwJ, this.qxa);
        GMTrace.o(8396661063680L, 62560);
        return;
      }
      this.qxc.bkL();
    }
    GMTrace.o(8396661063680L, 62560);
  }
  
  public final void dD(String paramString1, String paramString2)
  {
    GMTrace.i(8396929499136L, 62562);
    this.nkl = paramString1;
    this.path = paramString2;
    fM(true);
    GMTrace.o(8396929499136L, 62562);
  }
  
  public static abstract interface a
  {
    public abstract void a(List<amn> paramList, Map<Integer, Integer> paramMap1, Map<Integer, Integer> paramMap2, int paramInt1, int paramInt2, dl paramdl);
    
    public abstract void bkL();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */