package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.an.a.a;
import com.tencent.mm.an.a.a.c;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.n;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.pd;
import java.util.LinkedList;

public final class k
  extends i
{
  private View kzS;
  
  public k()
  {
    GMTrace.i(4995583836160L, 37220);
    GMTrace.o(4995583836160L, 37220);
  }
  
  public final void MH()
  {
    GMTrace.i(4995718053888L, 37221);
    GMTrace.o(4995718053888L, 37221);
  }
  
  public final void amb()
  {
    GMTrace.i(4995986489344L, 37223);
    if (this.kzS != null) {
      this.kzS.setVisibility(8);
    }
    GMTrace.o(4995986489344L, 37223);
  }
  
  public final void update()
  {
    GMTrace.i(4995852271616L, 37222);
    if (this.kzS == null) {
      this.kzS = ((ViewStub)findViewById(R.h.bpz)).inflate();
    }
    this.kzS.setOnClickListener(this.kzR.akP());
    Object localObject1 = this.kzR.akL().aiK().tFo;
    if (!TextUtils.isEmpty(((pd)localObject1).ovp))
    {
      ((TextView)findViewById(R.h.bpu)).setText(((pd)localObject1).ovp);
      findViewById(R.h.bpv).setVisibility(0);
    }
    ImageView localImageView;
    for (;;)
    {
      localImageView = (ImageView)findViewById(R.h.bpy);
      if ((((pd)localObject1).tKV == null) || (((pd)localObject1).tKV.size() <= 0) || (TextUtils.isEmpty((CharSequence)((pd)localObject1).tKV.get(0)))) {
        break;
      }
      localObject1 = (String)((pd)localObject1).tKV.get(0);
      localImageView.setVisibility(0);
      Object localObject2 = new c.a();
      ((c.a)localObject2).hCS = e.gZT;
      n.Jb();
      ((c.a)localObject2).hDk = null;
      ((c.a)localObject2).hCR = com.tencent.mm.plugin.card.model.m.tG((String)localObject1);
      ((c.a)localObject2).hCP = true;
      ((c.a)localObject2).hDm = false;
      ((c.a)localObject2).hCN = true;
      localObject2 = ((c.a)localObject2).Jk();
      n.Ja().a((String)localObject1, localImageView, (c)localObject2);
      GMTrace.o(4995852271616L, 37222);
      return;
      findViewById(R.h.bpv).setVisibility(8);
    }
    localImageView.setVisibility(8);
    GMTrace.o(4995852271616L, 37222);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */