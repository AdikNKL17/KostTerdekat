package com.merapitech.adik.kostterdekat

import android.graphics.Color
import android.graphics.Typeface
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

class KostListUI : AnkoComponent<ViewGroup> {

    companion object {
        val kostThumbnail = 1
        val namaKost = 2
        val alamatKost = 3
        val hargaKost = 4
        val textCard = 5
    }

    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui) {
        /*cardView{
            lparams{
                width = matchParent
                height = wrapContent
                topMargin = dip(20)
                leftMargin = dip(20)
                rightMargin = dip(20)
            }
            id = R.id.card
            verticalLayout {
                val thumbnail = imageView{
                    id = kostThumbnail
                    setImageResource(R.drawable.thumbnail_kost)
                    scaleType = ImageView.ScaleType.CENTER_CROP
                }.lparams{
                    width = matchParent
                    height = dip(134)
                }

                relativeLayout {
                    lparams{
                        width = matchParent
                        height = wrapContent
                        leftMargin = dip(16)
                        rightMargin = dip(16)
                        topMargin = dip(16)
                        bottomMargin = dip(16)
                    }
                    textView("Nama Kost"){
                        id = namaKost
                        textSize = 18f
                        textColor = Color.BLACK
                    }

                    textView("Alamat Kost"){
                        id = alamatKost
                        textSize = 12f
                        textColor = R.color.colorAlamat
                    }.lparams{
                        topMargin = dip(8)
                        below(namaKost)
                    }

                    relativeLayout {

                        linearLayout {
                            id = R.id.rating
                            orientation = LinearLayout.HORIZONTAL
                            lparams{
                                width = wrapContent
                                height = wrapContent
                            }

                            imageView {
                                imageResource = R.drawable.ic_star_black_24dp
                            }.lparams{
                                width = dip(20)
                                height = dip(20)
                            }
                            imageView {
                                imageResource = R.drawable.ic_star_black_24dp
                            }.lparams{
                                width = dip(20)
                                height = dip(20)
                            }
                            imageView {
                                imageResource = R.drawable.ic_star_black_24dp
                            }.lparams{
                                width = dip(20)
                                height = dip(20)
                            }
                            imageView {
                                imageResource = R.drawable.ic_star_black_24dp
                            }.lparams{
                                width = dip(20)
                                height = dip(20)
                            }
                            imageView {
                                imageResource = R.drawable.ic_star_black_24dp
                            }.lparams{
                                width = dip(20)
                                height = dip(20)
                            }
                        }
                        textView{
                            id = hargaKost
                            text = "750.000"
                            textSize = 15f
                        }.lparams{

                            alignParentRight()
                        }
                    }.lparams{
                        width = matchParent
                        below(alamatKost)
                        topMargin = dip(8)
                    }


                }
            }

        }*/
        cardView {
            lparams {
                margin = dip(8)
                width = matchParent
                leftMargin = dip(16)
                rightMargin = dip(16)
                bottomMargin = dip(8)
                isClickable = true
                isFocusable = true

            }
            radius = 3f
            cardElevation = 8f
            relativeLayout {
                lparams{
                    width = matchParent
                    height = wrapContent
                }

                val ava = imageView {
                    id = kostThumbnail
                    imageResource = R.drawable.thumbnail_kost
                    scaleType = ImageView.ScaleType.CENTER_CROP
                }.lparams {
                    width = matchParent
                    height = dip(120)
                }
                verticalLayout {
                    id = textCard
                    leftPadding = dip(16)
                    rightPadding = dip(16)
                    topPadding = dip(16)

                    textView {
                        id = namaKost
                        text = "Nama Kost"
                        textSize = 18f
                        textColor = Color.BLACK // <- it is sp, no worries
                        typeface = Typeface.DEFAULT_BOLD
                        /*textColor = Color.*//*WHITE*/
                       /* Typeface.createFromAsset(assets, "@font/monserrat_regular.ttf")*/
                    }

                    textView {
                        id = alamatKost
                        text = "alamat kost"
                        textSize = 14f
                        maxHeight = dip(16)
                        /*textColor = Color.WHITE*/
                    }.lparams{
                        topMargin = dip(8)
                    }
                }.lparams{
                    width  = matchParent
                    height = wrapContent
                    below(ava)
                }
                linearLayout {
                    orientation = LinearLayout.HORIZONTAL
                    lparams{
                        width = wrapContent
                        height = wrapContent
                    }

                    imageView {
                        imageResource = R.drawable.ic_star_black_24dp
                    }.lparams{
                        width = dip(20)
                        height = dip(20)
                    }
                    imageView {
                        imageResource = R.drawable.ic_star_black_24dp
                    }.lparams{
                        width = dip(20)
                        height = dip(20)
                    }
                    imageView {
                        imageResource = R.drawable.ic_star_black_24dp
                    }.lparams{
                        width = dip(20)
                        height = dip(20)
                    }
                    imageView {
                        imageResource = R.drawable.ic_star_black_24dp
                    }.lparams{
                        width = dip(20)
                        height = dip(20)
                    }
                    imageView {
                        imageResource = R.drawable.ic_star_black_24dp
                    }.lparams{
                        width = dip(20)
                        height = dip(20)
                    }

                }.lparams{
                    below(textCard)
                    topMargin = dip(8)
                    leftMargin = dip(16)
                    bottomMargin = dip(16)
                }

                linearLayout{
                    orientation = LinearLayout.HORIZONTAL
                    textView {
                        text = "Rp. "
                        textSize = 19f
                        typeface = Typeface.DEFAULT_BOLD
                        textColor = resources.getColor(R.color.colorPrimary)
                        /*textColor = Color.WHITE*/
                    }

                    textView {
                        id = hargaKost
                        text = "Harga Kost"
                        textSize = 19f
                        typeface = Typeface.DEFAULT_BOLD
                        textColor = resources.getColor(R.color.colorPrimary)
                        /*textColor = Color.WHITE*/
                    }
                }.lparams{
                    alignParentRight()
                    rightMargin = dip(16)
                    below(textCard)
                    topMargin = dip(8)
                }


            }

        }

    }

}