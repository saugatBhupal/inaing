import React from 'react'
import styled from 'styled-components'
import image from '../../assets/images/items/item-1.png'

const Wrapper = styled.div`
    margin-top : 10px;
    margin : 30px;
`
const Container = styled.div`
    display : flex;
`
const Image = styled.div``
const Text  = styled.div`
    color : #0f2c56;
    width : fit-content;
    margin : 25px;
`
const Title = styled.div`
    font-weight : 600;
`
const Desc = styled.div``
const Color = styled.div`
    margin : 5px 0px;
`
const Price = styled.div`
    font-weight : 600;
`
function SearchItemCard() {
  return (
    <Wrapper>
        <Container>
            <Image>
                <img src={image} alt="" height={"180px"}/>
            </Image>
            <Text>
                <Title>PLAIN SCARF</Title>
                <Desc>in pure new wool</Desc>
                <Color><u>4 Color(s)</u></Color>
                <Price>रु 1500</Price>
            </Text>
        </Container>
    </Wrapper>
  )
}

export default SearchItemCard