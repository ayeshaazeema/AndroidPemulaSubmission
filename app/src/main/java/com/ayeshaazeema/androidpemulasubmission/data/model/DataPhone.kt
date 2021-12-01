package com.ayeshaazeema.androidpemulasubmission.data.model

import com.ayeshaazeema.androidpemulasubmission.R

object DataPhone {
    private val phoneName = arrayOf(
        "Galaxy Z Fold3 5G",
        "Galaxy Z Flip3 5G",
        "Galaxy S21+ 5G",
        "Galaxy S21 Ultra 5G",
        "Galaxy Note20 Ultra",
        "Galaxy Note20",
        "Galaxy A52",
        "Galaxy A32",
        "Galaxy A32 5G",
        "Galaxy A72"
    )

    private val phoneBrand = arrayOf(
        "Samsung",
        "Samsung",
        "Samsung",
        "Samsung",
        "Samsung",
        "Samsung",
        "Samsung",
        "Samsung",
        "Samsung",
        "Samsung"
    )

    private val phonePrice =
        arrayOf(
            "Rp 26.999.000",
            "Rp 15.999.000",
            "Rp 16.999.000",
            "Rp 18.999.000",
            "Rp 18.999.000",
            "Rp 13.499.000",
            "Rp 4.999.000",
            "Rp 3.599.000",
            "Rp 22.500.000",
            "Rp 5.999.000"
        )

    private val phoneDescription = arrayOf(
        "This is everything you’d want in a premium, durable, 5G smartphone. Then we made it unfold — revealing a massive screen so you can watch, work and play like never before.",
        "Folds into your pocket. Tucks into your purse. Slips into your skinniest jeans. Then you can take it out and it flips open into a full-screened 5G smartphone and flexes to your favorite angles.",
        "Never miss that perfect shot again. Meet Galaxy S21+ 5G. Designed to revolutionize video and photography, with beyond cinematic 8K resolution so you can snap epic photos right out of video. It has it all in two sizes: 64MP, our fastest chipset and a massive all-day battery. Things just got epic.",
        "Introducing Galaxy S21 Ultra 5G. Designed with a unique contour-cut camera to create a revolution in photography — letting you capture cinematic 8K video and snap epic stills, all in one go. And with Galaxy’s fastest chipset, strongest glass, 5G and an all-day battery, Ultra easily lives up to its name.",
        "The first to merge a pen with a phone, Note put a whole new world in your pocket. As we face a new normal, life demands a new kind of device. This is not a smartphone as you know it. This is a computer suite in your pocket. This is next-level gaming on mobile. This is a pro-grade 8K camera and editing suite. This is the power phone that forever changes how you work and play.",
        "The Xtrada 7 is designed for riders who want to ride on a wide variety of terrain. The ALX super light 6061 hydro formed aluminum frame uses heat treated, hydro formed and butted tubing to give an optimal strength to weight ratio. The tapered head tube provides stable, front-end precision and the new Boost hub spacing on this frame allows for a stiffer wheel with more tyre clearance. The Boost system has also allowed for shorter chain stays, which makes the back of the bike a lot easier to flick around corners.The Xtrada 7 utilises Polygon’s new Wheel Fit Size System whereby each frame size is paired with the wheel size that best fits the rider and sets them up for optimal efficiency and power transfer. Frame S, M, L feature 27.5” wheels and frame M, L, XL come with 29” wheels. The Xtrada 7 is a true cross country mountain bike with a geometry built for speed and stability coupled with tough, trail-ready components. It is perfect for hitting the local single track or an all-day mountain adventure.",
        "Feast your eyes on vibrant details with the FHD+ Super AMOLED display, reaching 800 nits for clarity even in bright daylight. Eye Comfort Shield lowers blue light, and Real Smooth keeps the view smooth, whether you’re gaming or scrolling. All on the expansive 6.5-inch Infinity-O Display.",
        "Wrap your hands around the elegant soft edge design on the stunning Galaxy A32. With the iconic camera design and glossy finish on the back, this phone not only stands out — it sets a new standard. Choose from four eye-catching colors: Awesome Black, Awesome White, Awesome Blue and Awesome Violet.",
        "On the next-generation mobile data network, the power of 5G fast speeds change the way you experience and share content—from super smooth gaming and streaming, to ultra fast sharing and downloading. Upgrade to the Galaxy A32 5G and speed up your smartphone experience.",
        "Galaxy A72’s 32MP front camera snaps clear, high-resolution selfies throughout the day. And with bokeh effect to gently blur the background, your face becomes the star."
    )

    private val phoneImage = intArrayOf(
        R.drawable.galaxy_z_fold3_5g,
        R.drawable.galaxy_z_flip3_5g,
        R.drawable.galaxy_s21_5g,
        R.drawable.galaxy_s21_ultra_5g,
        R.drawable.galaxy_note20_ultra,
        R.drawable.galaxy_note20,
        R.drawable.galaxy_a52,
        R.drawable.galaxy_a32,
        R.drawable.galaxy_a32_5g,
        R.drawable.galaxy_a72
    )

    val listPhone: ArrayList<Phone>
        get() {
            val list = arrayListOf<Phone>()
            for (position in phoneName.indices) {
                val phone = Phone()
                phone.name = phoneName[position]
                phone.brand = phoneBrand[position]
                phone.price = phonePrice[position]
                phone.description = phoneDescription[position]
                phone.image = phoneImage[position]
                list.add(phone)
            }
            return list
        }
}

