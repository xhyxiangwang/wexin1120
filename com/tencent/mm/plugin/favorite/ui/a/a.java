package com.tencent.mm.plugin.favorite.ui.a;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.favorite.b.x.a;
import java.util.Set;

public abstract class a
  extends BaseAdapter
  implements AdapterView.OnItemClickListener
{
  protected Set<Integer> lTo;
  protected x.a lTp;
  protected a lTq;
  protected long lastUpdateTime;
  protected int type;
  
  public a()
  {
    GMTrace.i(6331721318400L, 47175);
    GMTrace.o(6331721318400L, 47175);
  }
  
  public final void a(x.a parama)
  {
    GMTrace.i(6332526624768L, 47181);
    this.lTp = parama;
    GMTrace.o(6332526624768L, 47181);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(6332123971584L, 47178);
    this.lTq = parama;
    GMTrace.o(6332123971584L, 47178);
  }
  
  public final long axQ()
  {
    GMTrace.i(6331989753856L, 47177);
    long l = this.lastUpdateTime;
    GMTrace.o(6331989753856L, 47177);
    return l;
  }
  
  public final void axR()
  {
    GMTrace.i(6332258189312L, 47179);
    if (this.lTq != null) {
      this.lTq.axP();
    }
    GMTrace.o(6332258189312L, 47179);
  }
  
  public abstract void axS();
  
  public abstract void axT();
  
  public final void e(Set<Integer> paramSet)
  {
    GMTrace.i(6332392407040L, 47180);
    this.lTo = paramSet;
    GMTrace.o(6332392407040L, 47180);
  }
  
  public final int getType()
  {
    GMTrace.i(6331855536128L, 47176);
    int i = this.type;
    GMTrace.o(6331855536128L, 47176);
    return i;
  }
  
  public abstract boolean isEmpty();
  
  public static abstract interface a
  {
    public abstract void axP();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */