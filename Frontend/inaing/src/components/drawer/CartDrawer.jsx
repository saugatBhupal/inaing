import React from 'react'
import styled from 'styled-components'
import ButtonA from '../button/ButtonA'

const Wrapper = styled.div`
    position : fixed;
    height : 100%;
    width : 100%;
    background-color : #0000005b;
    border-top : 1px solid #15325513;
`
const Cart = styled.div`
    position : fixed;
    height : 100%;
    width : 500px;
    background-color : #ffffff;
    right : 0;
    animation : appear 0.6s;
    @keyframes appear {
        from{
            opacity : 0;
            transform : translateX(500px)
        }
        to{
            opacity : 1;
            transform : translateX(0px)
        }
    }
`
const Top = styled.div`
    display : flex;
    align-items : center;
    justify-content : space-between;
    padding-bottom : 20px;
    border-bottom : 2px solid #15325b54;
`
const Title = styled.div`
    color : #0f2c56;
    font-size : 45px;
    padding :10px 40px;
`
const Content = styled.div`
    padding-top : 40px;
    display : flex;
    flex-direction : column;
    button{
        margin : 10px 15px;
    }
`
const CartTitle = styled.div`
    text-align : center;
    font-size : 20px;
    color : #15468c;
`
const Padding = styled.div`
    padding-top : 40px;
`
function CartDrawer() {
  return (
    <Wrapper> 
        <Cart>
            <Top>
                <Title>Cart</Title>
            </Top>
            <Content>
                <CartTitle>
                    You have no products in your cart.
                </CartTitle>
                <Padding/>
                <ButtonA text={"Sailor jumpers (for Women)"}/>
                <ButtonA text={"Sailor jumpers (for Men)"}/>
            </Content>
        </Cart>
    </Wrapper>
  )
}

export default CartDrawer