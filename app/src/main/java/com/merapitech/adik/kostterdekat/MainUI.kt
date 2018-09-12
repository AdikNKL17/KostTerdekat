package com.merapitech.adik.kostterdekat

import android.graphics.Color
import android.os.Build
import android.support.design.widget.AppBarLayout
import android.support.v7.widget.LinearLayoutManager
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.cardview.v7.cardView
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainUI : AnkoComponent<MainActivity> {

    companion object {
        val toolbar = 1
    }

    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
        relativeLayout {
            lparams{
                width = matchParent
                height = matchParent
            }
            backgroundResource = R.color.colorBG
            appBarLayout {

                id = R.id.appBar
                toolbar {
                    lparams{
                        width = matchParent
                    }
                    id = toolbar
                    backgroundResource = R.color.colorPrimary
                    setNavigationIcon(R.drawable.ic_arrow_back_white_24dp)
                    title = "Kost Terdekat"
                    setTitleTextColor(Color.WHITE)
                    setNavigationOnClickListener {
                        toast("Hi")
                    }
                    inflateMenu(R.menu.terdekat_menu)
                }
                linearLayout {
                    orientation = LinearLayout.HORIZONTAL
                    backgroundResource = R.color.colorWhite
                    linearLayout {
                        lparams{
                            width = matchParent
                            height = matchParent
                            weight = 1F
                            isClickable = true
                            isFocusable = true
                        }
                        relativeLayout {
                            lparams {
                                width = matchParent
                                height = matchParent
                            }
                            linearLayout {
                                orientation = LinearLayout.HORIZONTAL
                                lparams{
                                    width = wrapContent
                                    height = wrapContent
                                }
                                imageView {
                                    setImageResource(R.drawable.ic_filter_list_black_24dp)
                                }.lparams{
                                    height = dip(22)
                                    gravity = Gravity.CENTER_VERTICAL
                                }
                                textView("Saring"){
                                    textColor  = resources.getColor(R.color.colorPrimary)
                                    textSize = 15f
                                }.lparams{
                                    leftMargin = dip(13)
                                    gravity = Gravity.CENTER_VERTICAL
                                }
                            }.lparams{
                                centerInParent()
                            }
                        }

                        setOnClickListener {
                            toast("Saring")
                        }

                    }
                    view {
                        backgroundColor = resources.getColor(R.color.colorDivider)
                    }.lparams{
                        width = dip(1)
                        topMargin = dip(6)
                        bottomMargin = dip(6)
                    }

                    linearLayout {
                        lparams{
                            width = matchParent
                            height = matchParent
                            weight = 1F
                            isClickable = true
                            isFocusable = true
                        }
                        relativeLayout {
                            lparams {
                                width = matchParent
                                height = matchParent
                            }
                            linearLayout {
                                orientation = LinearLayout.HORIZONTAL
                                lparams{
                                    width = wrapContent
                                    height = wrapContent
                                }
                                imageView {
                                    setImageResource(R.drawable.ic_sort_black_24dp)
                                }.lparams{
                                    height = dip(22)
                                    gravity = Gravity.CENTER_VERTICAL
                                }
                                textView("Urutkan"){
                                    textColor  = resources.getColor(R.color.colorPrimary)
                                    textSize = 15f
                                }.lparams{
                                    leftMargin = dip(13)
                                    gravity = Gravity.CENTER_VERTICAL
                                }
                            }.lparams{
                                centerInParent()
                            }
                        }

                    }
                    view {
                        backgroundColor = resources.getColor(R.color.colorDivider)
                    }.lparams{
                        width = dip(1)
                        topMargin = dip(6)
                        bottomMargin = dip(6)
                    }
                    linearLayout {
                        lparams{
                            width = matchParent
                            height = matchParent
                            weight = 1F
                            isClickable = true
                            isFocusable = true
                        }
                        relativeLayout {
                            lparams {
                                width = matchParent
                                height = matchParent
                            }
                            linearLayout {
                                orientation = LinearLayout.HORIZONTAL
                                lparams{
                                    width = wrapContent
                                    height = wrapContent
                                }
                                imageView {
                                    setImageResource(R.drawable.ic_map_black_24dp)
                                }.lparams{
                                    height = dip(22)
                                    gravity = Gravity.CENTER_VERTICAL
                                }
                                textView("Map"){
                                    textColor  = resources.getColor(R.color.colorPrimary)
                                    textSize = 15f
                                }.lparams{
                                    leftMargin = dip(13)
                                    gravity = Gravity.CENTER_VERTICAL
                                }
                            }.lparams{
                                centerInParent()
                            }
                        }

                    }
                }.lparams{
                    width = matchParent
                    height = dip(40)
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        elevation = 4f
                    }
                }
            }.lparams{
                width = matchParent
                height = wrapContent
            }

            relativeLayout {
                lparams{
                    width = matchParent
                    height = matchParent
                }
                backgroundResource = R.color.colorBG

                recyclerView {
                    lparams {
                        id = R.id.listKost
                        width = matchParent
                        height = matchParent
                    }

                    layoutManager = LinearLayoutManager(context)

                    val list: ArrayList<Kost> = arrayListOf()
                    list.add(Kost(R.drawable.thumbnail_kost,"Nama Kost Okelah 1","Jl. Lorem Ipsum is simply dummy text of the pinting and typesetting", 750000))
                    list.add(Kost(R.drawable.thumbnail_kost3,"Nama Kost Okelah 2","Jl. Lorem Ipsum is simply dummy text of the pinting and typesetting", 650000))
                    list.add(Kost(R.drawable.thumbnail_kost3,"Nama Kost Okelah 3","Jl. Lorem Ipsum is simply dummy text of the pinting and typesetting", 450000))
                    list.add(Kost(R.drawable.thumbnail_kost,"Nama Kost Okelah 4","Jl. Lorem Ipsum is simply dummy text of the pinting and typesetting", 550000))

                    adapter = KostAdapter(list)
                    isClickable = true
                    setOnClickListener(View.OnClickListener {
                        toast("click")
                    })
                }

            }.lparams{
                width = matchParent
                height = matchParent
                below(R.id.appBar)
            }

        }
    }
}