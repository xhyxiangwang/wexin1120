package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.g.a.jv;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d
  extends h
{
  private static HashMap<String, Boolean> oUv;
  public com.tencent.mm.sdk.b.c oUw;
  
  static
  {
    GMTrace.i(7521561477120L, 56040);
    oUv = new HashMap();
    GMTrace.o(7521561477120L, 56040);
  }
  
  public d(Context paramContext, h.a parama)
  {
    super(paramContext, parama);
    GMTrace.i(7521024606208L, 56036);
    this.oUw = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7521024606208L, 56036);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(7521158823936L, 56037);
    w.i("MicroMsg.FavRecordAdapter", "updateData localId %s,status %s", new Object[] { Long.valueOf(((b)parama).oUu.field_localId), Integer.valueOf(((b)parama).oUu.field_itemStatus) });
    this.oUL = parama;
    this.oUt.clear();
    this.oUt.addAll(parama.oUt);
    notifyDataSetChanged();
    GMTrace.o(7521158823936L, 56037);
  }
  
  public final void d(com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    GMTrace.i(7521293041664L, 56038);
    w.d("MicroMsg.FavRecordAdapter", "setupRecord %s", new Object[] { Long.valueOf(((b)this.oUL).oUu.field_localId) });
    paramb.aHe = 1;
    paramb.oUu = ((b)this.oUL).oUu;
    GMTrace.o(7521293041664L, 56038);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */