import React from 'react'
import styled from 'styled-components'

const Wrapper = styled.div`
    max-width : 200px;
`
const Container = styled.div`
    text-align : center;
    display : flex;
    flex-direction : column;
`
const Image = styled.div`
    img{
        height : 120px;
    }
    width : fit-content;
    margin : auto;

`
const Title = styled.div`
    color : #0f2c56;
    font-size : 14px;
`
const Subtitle = styled.div`
    margin-top : 14px;
    font-size : 15px;
    color : #0f2d56ba;
`
function Feature(props) {
  return (
    <Wrapper>
        <Container>
            <Image>
                <img src={props.icon} alt="" />
            </Image>
            <Title>
                {props.title}
            </Title>
            <Subtitle>
                {props.subtitle}
            </Subtitle>
        </Container>
    </Wrapper>
  )
}

export default Feature