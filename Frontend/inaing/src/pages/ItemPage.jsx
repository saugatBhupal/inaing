import React from 'react'
import styled from 'styled-components'
import NavBar from '../components/navigation/NavBar'
import Padding from '../components/widget/Padding'
import ItemImage from '../assets/images/items/item-1.png'
import SelectorImage from '../assets/images/items/ittem-1-alternative.png'
import ShippingIcon from '../assets/images/icon/freeshipping-icon.png'
import ReturnIcon from '../assets/images/icon/returns-icon.png'
import ButtonB from '../components/button/ButtonB'
import Collection from '../components/collections/Collection'
import FeaturesSection from '../components/sections/FeaturesSection'

const Wrapper = styled.div`
    color : #0f2c56;
`
const Container = styled.div`
    display : flex;
    width : 90vw;
    margin : 60px auto;
    @media (max-width : 800px) {
        flex-direction : column
    }
`
const Left = styled.div`
    display : flex;
    @media (max-width : 800px) {
        width : fit-content;
        margin : auto;
    }
`
const Right = styled.div`
    margin-left : 100px;
    width : 30%;
    @media (max-width : 800px) {
        width : 100%;
        margin : auto;
    }
`
const ImageSelector = styled.div`
`
const Selector = styled.div`
    img{
        height : 90px;
        margin-right : 5px;
    }
`
const Image = styled.div`
    @media (max-width : 1100px) {
        img{
            height : 550px !important;
        }
    }
    img{
        height : 750px;
    }
`
const Title = styled.div`
    h1{
        margin : 0;
    }
`
const RightContainer = styled.div`
    
`
const SubTitle = styled.div`
    color : #0f2d56d1;
`
const Line = styled.div`
    height : 1px;
    margin : 20px 0px;
    width : 100%;
    background-color : #cfd5dd;
`
const Flex = styled.div`
    display : flex;
    justify-content : space-between;
    align-items : center;
    width : 100%;
    button{
        margin : 40px auto;
    }
`
const Color = styled.div`
    
`
const Price = styled.div`
    h1{
        margin : 0;
        font-size : 20px;
    }
`
const Size = styled.div``
const SizeTitle = styled.div`
    a{
        color:  #b5bbc3;
        font-size : 14px;
    }
`
const SizeOptions = styled.div`
    display : flex;
`
const SizeOption = styled.div`
    height : 30px;
    width : 30px;
    margin : 10px;
    margin-top : 15px;
    border : solid 1px #0f2c56;
    border-radius : 50%;
    cursor: pointer;
`
const Heart = styled.button`
    height : 50px;
    width : 50px;
    background-color : transparent;
    border : solid 1px #0000007d;
`
const Features = styled.div`
    
`
const Feature = styled.div`
    span{
        display : flex;
        align-items : center;
        font-size : 12px;
    }
`
export default function ItemPage() {
  return (
        <Wrapper>
            <NavBar/>
            <Padding/>
            <Container>
                <Left>
                    <ImageSelector>
                        <Selector>
                            <img src={SelectorImage} alt="" />
                        </Selector>
                        <Selector>
                            <img src={SelectorImage} alt="" />
                        </Selector>
                        <Selector>
                            <img src={SelectorImage} alt="" />
                        </Selector>
                        <Selector>
                            <img src={SelectorImage} alt="" />
                        </Selector>
                        
                    </ImageSelector>
                    <Image>
                        <img src={ItemImage} alt="" />
                    </Image>
                </Left>
                <Right>
                    <RightContainer>
                        <Title><h1>Madison printed shirt</h1></Title>
                        <SubTitle>long sleeves, in light cotton</SubTitle>
                        <Line/>
                        <Flex>
                            <Color>1 Color(s) : BLANC D'HIVER/CIRE</Color>
                            <Price> <h1>रु. 1500</h1></Price>
                        </Flex>
                        <Line/>
                        <Size>
                            <SizeTitle>Select your size <a href="">Size guide</a></SizeTitle>
                            <SizeOptions>
                                <SizeOption>

                                </SizeOption>
                                <SizeOption>
                                    
                                </SizeOption>
                                <SizeOption>
                                    
                                </SizeOption>
                                <SizeOption>
                                    
                                </SizeOption>
                                <SizeOption>
                                    
                                </SizeOption>
                            </SizeOptions>
                        </Size>
                        <Line/>
                        <Flex>
                            <ButtonB text={"Add to cart"}/>
                            <Heart></Heart>
                        </Flex>
                        <Features>
                            <Feature>
                                <span><img src={ShippingIcon} alt="" height={"30px"}/>FREE shipping on all €150+ orders</span>
                            </Feature>
                            <Feature>
                            <span><img src={ReturnIcon} alt="" height={"30px"}/>Return within 30 days of purchase. Conditions apply.</span>
                            </Feature>
                        </Features>
                    </RightContainer>
                </Right>
            </Container>
            <Collection title ={"You may also like"}/>
            <Line/>
            <FeaturesSection/>
        </Wrapper>
  )
}
