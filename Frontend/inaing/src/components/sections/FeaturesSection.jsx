import React from 'react'
import styled from 'styled-components'
import Feature from '../widget/Feature'
import shippingIcon from '../../assets/images/icon/freeshipping-icon.png'
import secureIcon from '../../assets/images/icon/securepayment-icon.png'
import returnIcon from '../../assets/images/icon/returns-icon.png'

const Wrapper = styled.div`
    display : flex;
    justify-content : space-evenly;
    margin : 60px auto;
`
function FeaturesSection() {
  return (
    <Wrapper>
        <Feature icon= {shippingIcon} title ={"FREE SHIPPING"} subtitle = {"On all  रु 15000 + orders. Expedited service also available"}/>
        <Feature icon= {secureIcon} title ={"SECURE PAYMENT"} subtitle = {"By Credit Card, Khalti & Esewa"}/>
        <Feature icon= {returnIcon} title ={"RETURNS"} subtitle = {"Within 30 days of purchase. Conditions apply"}/>
        {/* <Feature icon= {shippingIcon} title ={"FREE SHIPPING"} subtitle = {"On all  रु 15000 + orders. Expedited service also available"}/> */}
    </Wrapper>
  )
}

export default FeaturesSection