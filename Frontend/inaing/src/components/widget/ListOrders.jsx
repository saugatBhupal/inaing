import React from 'react'
import styled from 'styled-components'

const Wrapper = styled.div`
    background-color : #f7f7f7;
    /* padding :40px; */
    max-width : 500px;
    margin :40px auto;
    button{
        width : 100%;
    }
`
const Orders = styled.div`
    display : flex;
    flex-direction : column;
`
function ListOrders() {
  return (
    <Wrapper>
        <Orders>

        </Orders>
    </Wrapper>
  )
}

export default ListOrders