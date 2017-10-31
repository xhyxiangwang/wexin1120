package com.tencent.mm.plugin.favorite.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.favorite.b.ah;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.anp;
import com.tencent.mm.protocal.c.ans;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.tools.MMTextInputUI;
import com.tencent.mm.x.ap;
import java.util.LinkedList;

public class FavTextEditUI
  extends MMTextInputUI
{
  public FavTextEditUI()
  {
    GMTrace.i(6312259747840L, 47030);
    GMTrace.o(6312259747840L, 47030);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6312393965568L, 47031);
    int i = R.i.cTW;
    GMTrace.o(6312393965568L, 47031);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6312528183296L, 47032);
    super.onCreate(paramBundle);
    oC(R.l.dWt);
    GMTrace.o(6312528183296L, 47032);
  }
  
  protected final void w(CharSequence paramCharSequence)
  {
    GMTrace.i(6312662401024L, 47033);
    if ((paramCharSequence == null) || (bg.mZ(paramCharSequence.toString())))
    {
      w.w("MicroMsg.FavTextEditUI", "text is null");
      GMTrace.o(6312662401024L, 47033);
      return;
    }
    int i = getIntent().getIntExtra("key_fav_item_id", -1);
    paramCharSequence = paramCharSequence.toString();
    if (i <= 0)
    {
      w.w("MicroMsg.ModFavItemLogic", "modEditText favid:%d", new Object[] { Integer.valueOf(i) });
      GMTrace.o(6312662401024L, 47033);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    Object localObject1 = new anp();
    ((anp)localObject1).ujy = 4;
    ((anp)localObject1).ujz = 0;
    localLinkedList.add(localObject1);
    localObject1 = new LinkedList();
    Object localObject2 = new ans();
    ((ans)localObject2).mFu = "favitem.desc";
    ((ans)localObject2).paD = bg.ap(paramCharSequence, "");
    ((LinkedList)localObject1).add(localObject2);
    localObject2 = new ans();
    ((ans)localObject2).mFu = "favitem.edittime";
    ((ans)localObject2).paD = String.valueOf(bg.Po());
    ((LinkedList)localObject1).add(localObject2);
    localObject2 = h.awD().cd(i);
    if (localObject2 != null)
    {
      ((j)localObject2).field_edittime = bg.Po();
      ((j)localObject2).field_favProto.ey(((j)localObject2).field_edittime);
      ((j)localObject2).field_favProto.Qe(bg.ap(paramCharSequence, ""));
      h.awD().a((j)localObject2, new String[] { "localId" });
    }
    paramCharSequence = new ah(i, localLinkedList, (LinkedList)localObject1);
    ap.wT().a(paramCharSequence, 0);
    g.paX.i(10874, new Object[] { Integer.valueOf(1) });
    GMTrace.o(6312662401024L, 47033);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/FavTextEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */