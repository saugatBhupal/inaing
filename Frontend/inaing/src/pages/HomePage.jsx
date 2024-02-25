import React from 'react'
import TopBar from '../components/TopBar/TopBar'
import NavBar from '../components/navigation/NavBar'
import HomePageHero from '../components/hero/HomePageHero'
import OurHeritage from '../components/sections/OurHeritage'
import BreakSection from '../components/sections/BreakSection'
import FeaturesSection from '../components/sections/FeaturesSection'
import SocialPosts from '../components/sections/SocialPosts'
import Collection from '../components/collections/Collection'
import styled from 'styled-components'
import Padding from '../components/widget/Padding'

function HomePage() {
  return (
    <>
        <NavBar currentPage={"Home"}/>
        <Padding/>
        <HomePageHero/>
        <OurHeritage/>
        <Collection/>
        <BreakSection/>
        <FeaturesSection/>
        <SocialPosts/>
    </>
  )
}

export default HomePage