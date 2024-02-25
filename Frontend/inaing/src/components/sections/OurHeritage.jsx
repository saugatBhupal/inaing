import React from 'react'
import styled from 'styled-components'
import ButtonA from '../button/ButtonA'

const Wrapper = styled.div`
    animation : appear 2s;
    @keyframes appear {
        0%{
            opacity : 0;
        }
        100%{
            opacity : 1;
        }
    }
    h1{
        margin-top : 100px;
        text-align : center;
    }
`
const Banner = styled.div`
    font-size : 38px;
    color : #444343bd;
    text-align : center;
    padding-top : 40px;
    a{
        color: #ad2b2b;
        font-weight : 600;
    }
    span{
        color: #0f2c56;
        font-weight : 600;
    }
    small{
        font-size : 18px;
    }
`
const Text = styled.div`
    width : 70vw;
    color : #0f2c56;
    font-size : 18px;
    text-align : center;
    margin : 20px auto;
`
const Center = styled.div`
    width : fit-content;
    margin : 20px auto;
`
function OurHeritage() {
  return (
    <Wrapper>
        <Banner>
            <small>Since 2020,</small><br/>
            Designed In <a>Nepal</a>, Worn <span>Across The World</span>
        </Banner>
        <Text>
            Classic Breton stripe and French stripe designs are deeply rooted in history, dating back over a century. Breton striped jerseys were introduced as the official French Navy uniform in 1858. French stripes have since influenced fashion trends all over the world and drive the inspiration behind our French shirt and sweater designs. Our military-inspired nautical clothing lines feature classic chic layers like the fisherman sweater, Breton stripe tees and iconic peacoats — simple Breton style garments that fit in every closet whether striped clothes are a staple in your wardrobe or not.
        </Text>
        <Center>
            <ButtonA text={"Learn More About Our Heritage"}/>
        </Center>
    </Wrapper>
  )
}

export default OurHeritage