package com.tencent.mm.plugin.fts.d;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.a.d;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public abstract class c
  extends b
  implements j
{
  public String fIW;
  public List<String> iOh;
  private com.tencent.mm.plugin.fts.a.a.a mkB;
  public HashSet<String> mky;
  public List<i.a> mmR;
  
  public c(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16708496523264L, 124488);
    this.mmR = Collections.synchronizedList(new LinkedList());
    this.iOh = new LinkedList();
    this.mky = new HashSet();
    GMTrace.o(16708496523264L, 124488);
  }
  
  public final void Tn()
  {
    GMTrace.i(16709570265088L, 124496);
    this.fIW = null;
    this.mky.clear();
    this.mmR.clear();
    GMTrace.o(16709570265088L, 124496);
  }
  
  public abstract com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet);
  
  public com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i parami, List<String> paramList)
  {
    GMTrace.i(18561372258304L, 138293);
    GMTrace.o(18561372258304L, 138293);
    return null;
  }
  
  public abstract com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama);
  
  public final void a(g paramg)
  {
    int i = 0;
    GMTrace.i(18561238040576L, 138292);
    switch (paramg.aHi)
    {
    default: 
      GMTrace.o(18561238040576L, 138292);
      return;
    case 0: 
      w.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "search type %d | result %d", new Object[] { Integer.valueOf(getType()), Integer.valueOf(paramg.mkD.size()) });
      if ((this.fIW == null) || (!this.fIW.equals(paramg.miB.fIW)))
      {
        w.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "Native Search: Not Same query origin:%s current:%s", new Object[] { paramg.miB.fIW, this.fIW });
        GMTrace.o(18561238040576L, 138292);
        return;
      }
      String[] arrayOfString = paramg.mkC;
      ArrayList localArrayList = new ArrayList();
      if ((arrayOfString != null) && (arrayOfString.length > 0)) {
        while (i < arrayOfString.length)
        {
          localArrayList.add(arrayOfString[i]);
          i += 1;
        }
      }
      this.iOh = localArrayList;
      this.mky = paramg.miB.mky;
      a(paramg, this.mky);
    }
    do
    {
      this.mmP.a(this, paramg.miB.fIW);
      break;
      w.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "onSearchError: type=%d | errorCode=%d | originQuery=%s", new Object[] { Integer.valueOf(getType()), Integer.valueOf(paramg.aHi), paramg.miB.fIW });
    } while (paramg.miB.fIW.equals(this.fIW));
    w.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "Native Search: Not Same Query");
    GMTrace.o(18561238040576L, 138292);
  }
  
  public abstract void a(g paramg, HashSet<String> paramHashSet);
  
  public final void a(String paramString, ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(16708630740992L, 124489);
    aBw();
    Tn();
    this.fIW = paramString;
    this.mkB = a(paramae, paramHashSet);
    GMTrace.o(16708630740992L, 124489);
  }
  
  public final void aBw()
  {
    GMTrace.i(16709033394176L, 124492);
    if (this.mkB != null)
    {
      ((l)h.j(l.class)).cancelSearchTask(this.mkB);
      this.mkB = null;
    }
    GMTrace.o(16709033394176L, 124492);
  }
  
  public final LinkedList<Integer> aBx()
  {
    GMTrace.i(16709838700544L, 124498);
    LinkedList localLinkedList = new LinkedList();
    int j = this.mmR.size();
    int i = 0;
    while (i < j)
    {
      i.a locala = (i.a)this.mmR.get(i);
      if (locala.mng != Integer.MAX_VALUE) {
        localLinkedList.add(Integer.valueOf(locala.mng));
      }
      i += 1;
    }
    GMTrace.o(16709838700544L, 124498);
    return localLinkedList;
  }
  
  public com.tencent.mm.plugin.fts.d.a.b b(int paramInt, i.a parama)
  {
    GMTrace.i(17482395942912L, 130254);
    parama = new com.tencent.mm.plugin.fts.d.a.b(paramInt);
    GMTrace.o(17482395942912L, 130254);
    return parama;
  }
  
  public final int nQ(int paramInt)
  {
    GMTrace.i(16709167611904L, 124493);
    int k = this.mmR.size();
    int i = 0;
    if (i < k)
    {
      i.a locala = (i.a)this.mmR.get(i);
      locala.mng = paramInt;
      int j = paramInt;
      if (locala.mnh) {
        j = paramInt + 1;
      }
      paramInt = j + (locala.mnk.size() + locala.mnl);
      locala.mni = paramInt;
      if (!locala.mnj) {
        break label116;
      }
      paramInt += 1;
    }
    label116:
    for (;;)
    {
      i += 1;
      break;
      GMTrace.o(16709167611904L, 124493);
      return paramInt;
    }
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a nR(int paramInt)
  {
    GMTrace.i(16709301829632L, 124494);
    int j = this.mmR.size();
    int i = 0;
    while (i < j)
    {
      i.a locala = (i.a)this.mmR.get(i);
      Object localObject;
      if ((locala.mng == paramInt) && (locala.mnh)) {
        localObject = b(paramInt, locala);
      }
      while (localObject != null)
      {
        if ((!locala.mnj) && (((com.tencent.mm.plugin.fts.d.a.a)localObject).position == locala.mni)) {
          ((com.tencent.mm.plugin.fts.d.a.a)localObject).mnx = true;
        }
        ((com.tencent.mm.plugin.fts.d.a.a)localObject).mmQ = this.mmQ;
        ((com.tencent.mm.plugin.fts.d.a.a)localObject).fIW = this.fIW;
        ((com.tencent.mm.plugin.fts.d.a.a)localObject).mny = locala.hJx;
        GMTrace.o(16709301829632L, 124494);
        return (com.tencent.mm.plugin.fts.d.a.a)localObject;
        if ((locala.mni == paramInt) && (locala.mnj))
        {
          localObject = new d(paramInt);
          ((com.tencent.mm.plugin.fts.d.a.a)localObject).mnA = (locala.mni - locala.mng);
        }
        else
        {
          localObject = a(paramInt, locala);
        }
      }
      i += 1;
    }
    GMTrace.o(16709301829632L, 124494);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/fts/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */