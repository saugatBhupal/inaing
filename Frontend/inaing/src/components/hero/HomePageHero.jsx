import React from 'react'
import styled from 'styled-components'
import heroDesktop from '../../assets/images/Hero/hero-desktop.png'
import heroMobile from '../../assets/images/Hero/hero-mobile.png'

const Wrapper = styled.div``
const Container = styled.div``
const HeroMobile = styled.div`
    position : relative;
    @media (min-width:700px) {
        display : none;
    }
    img{
        width : 100vw;
    }
`
const HeroDesktop = styled.div`
    @media (max-width:700px) {
        display : none;
    }
    img{
        width : 100vw;
    }
`
const TextMobile = styled.div`
    text-align : center;
    color : red;
    h1{
        margin : 0;
        text-align : center;
    }
`
function HomePageHero() {
  return (
    <Wrapper>
        <Container>
            <HeroMobile>
                <img src={heroMobile} alt="" />
            </HeroMobile>
            <HeroDesktop>
                <img src={heroDesktop} alt="" />
            </HeroDesktop>
        </Container>
    </Wrapper>
  )
}

export default HomePageHero