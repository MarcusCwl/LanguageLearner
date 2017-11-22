package tw.bao.languagelearner.main.contract

import android.content.Context
import android.content.Intent
import tw.bao.languagelearner.base.BasePresenter
import tw.bao.languagelearner.base.BaseView
import tw.bao.languagelearner.model.WordDatas

/**
 * Created by bao on 2017/10/25.
 */
interface WordsPreviewActivityContract {
    interface View : BaseView<Presenter> {
        fun getContext(): Context?
        fun getIntent(): Intent?
        fun setWordDatas(wordDatas: WordDatas)
    }

    interface Presenter : BasePresenter
}