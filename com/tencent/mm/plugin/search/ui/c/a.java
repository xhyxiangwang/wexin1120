package com.tencent.mm.plugin.search.ui.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.b.b;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends com.tencent.mm.plugin.fts.d.c
{
  private boolean poD;
  
  public a(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16469186314240L, 122705);
    ap.AS();
    paramContext = (String)com.tencent.mm.x.c.xi().get(6, null);
    if ((paramContext != null) && (paramContext.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      this.poD = bool;
      w.d("MicroMsg.FTS.FTSAddFriendUIUnit", "[FTSAddFriendUIUnit doSearchMobile : %s]", new Object[] { Boolean.valueOf(this.poD) });
      GMTrace.o(16469186314240L, 122705);
      return;
    }
  }
  
  private int[] bco()
  {
    GMTrace.i(11863236542464L, 88388);
    ArrayList localArrayList = new ArrayList();
    if (this.poD) {
      localArrayList.add(Integer.valueOf(16));
    }
    int[] arrayOfInt = new int[localArrayList.size()];
    int i = 0;
    while (i < localArrayList.size())
    {
      arrayOfInt[i] = ((Integer)localArrayList.get(i)).intValue();
      i += 1;
    }
    GMTrace.o(11863236542464L, 88388);
    return arrayOfInt;
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18365011722240L, 136830);
    String str = this.fIW;
    ArrayList localArrayList = new ArrayList();
    if (this.poD)
    {
      localArrayList.add(Integer.valueOf(131073));
      localArrayList.add(Integer.valueOf(131074));
    }
    int[] arrayOfInt = new int[localArrayList.size()];
    int i = 0;
    while (i < localArrayList.size())
    {
      arrayOfInt[i] = ((Integer)localArrayList.get(i)).intValue();
      i += 1;
    }
    paramae = f.a(str, arrayOfInt, bco(), -1, paramHashSet, b.mkU, this, paramae);
    paramae = ((l)com.tencent.mm.kernel.h.j(l.class)).search(9, paramae);
    GMTrace.o(18365011722240L, 136830);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16469588967424L, 122708);
    int i = paramInt - parama.mng - 1;
    i locali = null;
    Object localObject;
    if ((i < parama.mnk.size()) && (i >= 0))
    {
      locali = (i)parama.mnk.get(i);
      if ((locali.type == 131077) || (locali.type == 131078))
      {
        localObject = new com.tencent.mm.plugin.search.ui.a.h(paramInt);
        ((com.tencent.mm.plugin.search.ui.a.h)localObject).iOg = locali;
        ((com.tencent.mm.plugin.search.ui.a.h)localObject).iOh = parama.iOh;
        ((com.tencent.mm.plugin.search.ui.a.h)localObject).poj = true;
        if (localObject != null) {
          ((com.tencent.mm.plugin.fts.d.a.a)localObject).mnA = (i + 1);
        }
        GMTrace.o(16469588967424L, 122708);
        return (com.tencent.mm.plugin.fts.d.a.a)localObject;
      }
      if ((locali.type != 131073) && (locali.type != 131074)) {
        break label230;
      }
      localObject = new com.tencent.mm.plugin.search.ui.a.g(paramInt);
      ((com.tencent.mm.plugin.search.ui.a.g)localObject).iOg = locali;
      ((com.tencent.mm.plugin.search.ui.a.g)localObject).iOh = parama.iOh;
      ((com.tencent.mm.plugin.search.ui.a.g)localObject).poj = true;
    }
    label230:
    for (parama = (i.a)localObject;; parama = null)
    {
      localObject = parama;
      break;
      localObject = locali;
      if (parama.mnh) {
        break;
      }
      localObject = locali;
      if (paramInt != 0) {
        break;
      }
      localObject = new com.tencent.mm.plugin.search.ui.a.a(paramInt);
      ((com.tencent.mm.plugin.search.ui.a.a)localObject).iOh = this.iOh;
      break;
    }
  }
  
  protected final void a(com.tencent.mm.plugin.fts.a.a.g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18365145939968L, 136831);
    paramg = paramg.mkD;
    this.mmR.clear();
    paramHashSet = new i.a();
    paramHashSet.hJx = -4;
    paramHashSet.mnh = false;
    paramHashSet.iOh = this.iOh;
    paramHashSet.mnl = 1;
    paramHashSet.mnk = new LinkedList();
    this.mmR.add(paramHashSet);
    if (aG(paramg))
    {
      paramg = d.a(paramg, com.tencent.mm.plugin.fts.a.c.mjK);
      if (aG(paramg))
      {
        paramHashSet = new i.a();
        paramHashSet.hJx = -11;
        paramHashSet.mnk = paramg;
        paramHashSet.iOh = this.iOh;
        this.mmR.add(paramHashSet);
      }
    }
    GMTrace.o(18365145939968L, 136831);
  }
  
  public final int getType()
  {
    GMTrace.i(11863639195648L, 88391);
    GMTrace.o(11863639195648L, 88391);
    return 8192;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */