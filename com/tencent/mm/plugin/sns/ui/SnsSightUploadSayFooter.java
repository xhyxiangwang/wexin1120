package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputConnection;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.d;
import com.tencent.mm.pluginsdk.ui.chat.e;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.List;

public class SnsSightUploadSayFooter
  extends BasePanelKeybordLayout
{
  MMActivity fsU;
  private ImageButton nEi;
  ChatFooterPanel nEl;
  private boolean nEo;
  MMEditText qOh;
  SightRangeWidget qOi;
  SightLocationWidget qOj;
  
  public SnsSightUploadSayFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8642682159104L, 64393);
    this.qOh = null;
    this.nEo = true;
    this.fsU = ((MMActivity)paramContext);
    paramContext = (ViewGroup)inflate(this.fsU, i.g.pPq, this);
    this.nEi = ((ImageButton)paramContext.findViewById(i.f.bhw));
    this.nEi.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8504303681536L, 63362);
        SnsSightUploadSayFooter.d(SnsSightUploadSayFooter.this);
        GMTrace.o(8504303681536L, 63362);
      }
    });
    if (e.tgc == null) {
      this.nEl = new d(this.fsU);
    }
    for (;;)
    {
      this.qOi = ((SightRangeWidget)paramContext.findViewById(i.f.pKN));
      this.qOi.qxE = null;
      this.qOi.style = 1;
      this.qOj = ((SightLocationWidget)paramContext.findViewById(i.f.pKx));
      GMTrace.o(8642682159104L, 64393);
      return;
      this.nEl = e.tgc.ci(getContext());
      this.nEl.cU(ChatFooterPanel.SCENE_SNS);
      this.nEl.setVisibility(8);
      ((LinearLayout)findViewById(i.f.cse)).addView(this.nEl, -1, 0);
      this.nEl.oN();
      this.nEl.ar(false);
      this.nEl.sYp = new ChatFooterPanel.a()
      {
        public final void aLS()
        {
          GMTrace.i(8451690332160L, 62970);
          GMTrace.o(8451690332160L, 62970);
        }
        
        public final void acx()
        {
          GMTrace.i(8451958767616L, 62972);
          SnsSightUploadSayFooter.b(SnsSightUploadSayFooter.this).wTn.sendKeyEvent(new KeyEvent(0, 67));
          SnsSightUploadSayFooter.b(SnsSightUploadSayFooter.this).wTn.sendKeyEvent(new KeyEvent(1, 67));
          GMTrace.o(8451958767616L, 62972);
        }
        
        public final void append(String paramAnonymousString)
        {
          GMTrace.i(8452092985344L, 62973);
          try
          {
            SnsSightUploadSayFooter.b(SnsSightUploadSayFooter.this).Wn(paramAnonymousString);
            GMTrace.o(8452092985344L, 62973);
            return;
          }
          catch (Exception paramAnonymousString)
          {
            w.printErrStackTrace("MicroMsg.SnsSightUploadSayFooter", paramAnonymousString, "", new Object[0]);
            GMTrace.o(8452092985344L, 62973);
          }
        }
        
        public final void fR(boolean paramAnonymousBoolean)
        {
          GMTrace.i(8451824549888L, 62971);
          GMTrace.o(8451824549888L, 62971);
        }
      };
    }
  }
  
  private void abV()
  {
    GMTrace.i(8642816376832L, 64394);
    this.nEl.onPause();
    this.nEl.setVisibility(8);
    GMTrace.o(8642816376832L, 64394);
  }
  
  protected final List<View> aLR()
  {
    GMTrace.i(16631321329664L, 123913);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.nEl);
    GMTrace.o(16631321329664L, 123913);
    return localArrayList;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsSightUploadSayFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */