import React from 'react'
import styled from 'styled-components'
import image from '../../assets/images/items/item-1.png'
import imageAlternative from '../../assets/images/items/ittem-1-alternative.png'
import { useNavigate } from 'react-router-dom'

const Wrapper = styled.div`
    margin : 20px 0px;
    cursor: pointer;
`
const Tag = styled.div`
  position : absolute;
  top : 25px;
  left : 25px;
  font-size : 14px;
  padding : 1px 8px;
  padding-bottom : 2px;
  background-color : #0f2c56;
  color : white;
`
const Overlay = styled.div`
  display : none;
  height : 350px;
  width : 260px;
  top : 0px;
  background: linear-gradient(0deg, rgba(0,0,0,1) 0%, rgba(116, 116, 116, 0.116) 30%);
  position : absolute;
  color : white;
  text-align : center;
  cursor: pointer;
  animation : appear 0.2s;
  @keyframes appear {
    0%{
      opacity : 0;
    }
    100%{
      opacity : 1;
    }
  }
  @keyframes appear-text {
    0%{
      opacity : 0;
      transform : translateX(-10px);
    }
    100%{
      opacity : 1;
      /* transform : translateY(); */
    }
  }
  u{
    position: absolute;
    bottom: 50px;
    transform: translateX(-50%);
    line-height: 2px;
    animation : appear-text 0.2s;
  }

`
const ImageAlternative = styled.div`
  display : none;
  img{
    height : 350px;
    width : 260px;
    margin-right : 5px !important;
    animation : appear 0.2s;
  @keyframes appear {
    0%{
      opacity : 0;
    }
    100%{
      opacity : 1;
    }
  }
  }
`
const Image = styled.div`
  img{
    height : 350px;
    width : 260px;
    animation : appear 0.3s;
  @keyframes appear {
    0%{
      opacity : 0.4;
    }
    100%{
      opacity : 1;
    }
  }
  }
`
const Text = styled.div`
  text-align : center;
`
const Container = styled.div`
  position : relative;
  &:hover{
    ${Overlay}{
      display : initial;
    }
    ${ImageAlternative}{
      display : initial;
    }
    ${Image}{
      display : none;
    }
    ${Text}{
        transform : translateX(-2.5px);
    }
  }
`
const Title = styled.div`
  color : #0f2c56;
  font-weight : 600;
  font-size : 15px;
  margin-top : 14px;
`
const SubTitle = styled.div`
  color : #0f2c56;
`
const Price = styled.div`
  color : #0f2c56;
  font-weight : 600;
`
function ItemCardList() {
  const navigate = useNavigate()
  return (
    <Wrapper onClick={()=>navigate("/item")}>
      <Container>
        <Image>
          <img src={image} alt="" />
        </Image>
        <ImageAlternative>
          <img src={imageAlternative} alt="" />
        </ImageAlternative>
        <Tag>
          New
        </Tag>
        <Overlay>
          <u>Add to cart</u>
        </Overlay>
        <Text>
            <Title>
                VAUVILLE SAILOR-STYLE JUMPER
            </Title>
            <SubTitle>
                in wool, colourblock
            </SubTitle>
            <Price>
            रु 205.00
            </Price>
        </Text>
      </Container>
    </Wrapper>
  )
}

export default ItemCardList